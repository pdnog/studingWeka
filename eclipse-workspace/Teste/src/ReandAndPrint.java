import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader.ArffReader;

public class ReandAndPrint {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("/tmp/guest-rmlpso/Downloads/iris.arff"));
		ArffReader arff = new ArffReader(reader);
		Instances data = arff.getData();
		for (int i=0 ;i<= data.numInstances()-1;i++) {
			Instance instance = data.get(i);
			System.out.println(instance.stringValue(0));
		}
	}
}
