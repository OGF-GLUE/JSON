
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.ogf.glue2.*;

public class Glue2Pojo {

    public static void main(String[] argv) throws Exception {
	if (argv.length != 1) {
	    System.err.println("usage: Glue2Pojo <json file>");
	    System.exit(1);
	}

	System.out.printf("reading file %s%n",argv[0]);
	byte[] doc = Files.readAllBytes(Paths.get(argv[0]));

	System.out.println("parsing");
	ObjectMapper mapper = new ObjectMapper();
	Glue2 glue2 = mapper.readValue(doc,Glue2.class);

	if (glue2.getComputingActivity().size() > 0) {
	    System.out.printf("found %d computing activities%n",glue2.getComputingActivity().size());
	}
	if (glue2.getComputingShare().size() > 0) {
	    System.out.printf("found %d computing shares%n",glue2.getComputingShare().size());
	}
	if (glue2.getExecutionEnvironment().size() > 0) {
	    System.out.printf("found %d execution environments%n",glue2.getExecutionEnvironment().size());
	}
	if (glue2.getApplicationEnvironment().size() > 0) {
	    System.out.printf("found %d application environments%n",glue2.getApplicationEnvironment().size());
	}
    }
}
