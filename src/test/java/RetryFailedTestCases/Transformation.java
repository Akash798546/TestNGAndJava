package RetryFailedTestCases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;


public class Transformation implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testConstructor,Method testMehod)
	{
		
			annotation.setRetryAnalyzer(Retry.class);
		
	}
	
}
