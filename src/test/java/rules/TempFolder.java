package rules;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TempFolder {

    @Rule
    public TestName name = new TestName();

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void methodNamePrinted() {
        System.out.println(name.getMethodName());
    }

    @Test
    public void fileCreatedAndWrittenSuccessfully() throws IOException{
        File file = tempFolder.newFile("miki.txt");
        FileUtils.writeStringToFile(file, "Miki rocks!");

        String line = FileUtils.readFileToString(file);
        assertThat(line, is("Miki rocks!"));
    }

}
