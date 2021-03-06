package fr.m1ximeee.JsonCreator.processors;

import java.io.File;

public interface IProcessor
{
    void process(File dir, Object... args) throws Exception;
    void generate(Object... args);
    void save(File file, Object... args);
}
