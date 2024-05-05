package com.springbatch.housebatch.job.validator;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

public class FilePathParameterValidator implements JobParametersValidator {

    private static final String FILE_PATH = "filePath";

    @Override
    public void validate(JobParameters jobParameters) throws JobParametersInvalidException {
        String filePath = jobParameters.getString(FILE_PATH);
        if (!StringUtils.hasText(filePath)) {
            throw new JobParametersInvalidException(FILE_PATH + " is empty");
        }

        Resource resource = new ClassPathResource(filePath);
        if (!resource.exists()) {
            throw new JobParametersInvalidException(FILE_PATH + " : " + filePath + " does not exist");
        }
    }
}
