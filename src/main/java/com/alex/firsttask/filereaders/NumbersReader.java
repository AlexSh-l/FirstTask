package com.alex.firsttask.filereaders;

import com.alex.firsttask.constants.Constants;
import com.alex.firsttask.exceptions.FileReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersReader {

    private static final Logger logger = LogManager.getLogger();

    public List<String> readNumbers() throws FileReaderException {
        List<String> list;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(Constants.FILE_PATH))) {
            list = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new FileReaderException("Unable to read from file");
        }
        return list;
    }

}
