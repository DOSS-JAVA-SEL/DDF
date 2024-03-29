package org.tgp61Task1;
//Task
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestListener implements IAnnotationTransformer{

	public void tranformer(ITestAnnotation annotations, Method testMethod,Constructor testConstructor,
			Class testClass) {

		annotations.setRetryAnalyzer(org.tgp61Task1.TestFail.class);
	}

}
