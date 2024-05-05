package com.springbatch.housebatch.core.service;

import com.springbatch.housebatch.core.entity.Lawd;
import com.springbatch.housebatch.core.repository.LawdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LawdService {

    private final LawdRepository lawdRepository;

    @Transactional
    public void upsert(Lawd lawd) {
        // �����Ͱ� �����ϸ� ����, ������ ����
        Lawd savedLawd = lawdRepository.findByLawdCd(lawd.getLawdCd())
                .orElseGet(Lawd::new);

        savedLawd.setLawdCd(lawd.getLawdCd());
        savedLawd.setLawdDong(lawd.getLawdDong());
        savedLawd.setExist(lawd.getExist());
        lawdRepository.save(savedLawd);
    }
}
