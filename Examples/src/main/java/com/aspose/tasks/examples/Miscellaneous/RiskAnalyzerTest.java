/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Miscellaneous;

import com.aspose.tasks.ConfidenceLevel;
import com.aspose.tasks.ProbabilityDistributionType;
import com.aspose.tasks.Project;
import com.aspose.tasks.RiskAnalysisResult;
import com.aspose.tasks.RiskAnalysisSettings;
import com.aspose.tasks.RiskAnalyzer;
import com.aspose.tasks.RiskItemStatistics;
import com.aspose.tasks.RiskItemType;
import com.aspose.tasks.RiskPattern;
import com.aspose.tasks.Task;

public class RiskAnalyzerTest {
	public static void main(String[] args) throws Exception {
		// ExStart: prepare-risk-analysis
		RiskAnalysisSettings settings = new RiskAnalysisSettings();
		// set a number of iterations for Monte Carlo simulation (the default value is 100).
		settings.setIterationsCount(200);
		// ExEnd: prepare-risk-analysis
		
		//ExStart: identify-input-of-analysis
		Project project = new Project("NewProductDev.mpp"); // attached test project

		// Initialize a risk pattern
		Task task = project.getRootTask().getChildren().getById(14);

		RiskPattern pattern = new RiskPattern(task);
		// Select a distribution type for the random number generator to generate possible values from (only two types currently supported, namely normal and uniform)
		// note that the normal distributions are often used in the natural and social sciences to represent real-valued random variables whose distributions are not known,
		// thus this distribution is set to default (for more details see here: https://en.wikipedia.org/wiki/Normal_distribution)
		pattern.setDistribution (ProbabilityDistributionType.Normal);
		// Set the percentage of the most likely task duration which can happen in the best possible project scenario
		// (the default value is 75, which means that if the estimated specified task duration is 4 days then the optimistic duration will be 3 days)
		pattern.setOptimistic(70);
		// Set the percentage of the most likely task duration which can happen in the worst possible project scenario
		// (the defaut value is 125, which means that if the estimated specified task duration is 4 days then the pessimistic duration will be 5 days.).
		pattern.setPessimistic(130);
		// Set a confidence level that correspond to the percentage of the time the actual values will be within optimistic and pessimistic estimates.
		// You can think of it as a value of standard deviation: the more uncertain about your estimates you are, the more the value of standard deviation used in random number generator is
		pattern.setConfidenceLevel(ConfidenceLevel.CL75);

		// you can add as many risk patterns as needed to model expected project risks
		settings.getPatterns().add(pattern);
		//ExEnd: identify-input-of-analysis
		
		//ExStart: analyze-the-risk
		RiskAnalyzer analyzer= new RiskAnalyzer(settings);
		RiskAnalysisResult analysisResult = analyzer.analyze(project);
		//ExEnd: analyze-the-risk
		
		//ExStart: use-analysis
		//Select the desired output (here we get early finish of the root task)
		RiskItemStatistics rootEarlyFinish = analysisResult.getRiskItems(RiskItemType.EarlyFinish).get(project.getRootTask());

		System.out.println("Expected value: "+ rootEarlyFinish.getExpectedValue());
		System.out.println("StandardDeviation: " + rootEarlyFinish.getStandardDeviation());
		System.out.println("10% Percentile: " +rootEarlyFinish.getPercentile(10));
		System.out.println("50% Percentile: " + rootEarlyFinish.getPercentile(50));
		System.out.println("90% Percentile: " + rootEarlyFinish.getPercentile(90));
		System.out.println("Minimum: " + rootEarlyFinish.getMinimum());
		System.out.println("Maximum: " + rootEarlyFinish.getMaximum());

		// Also pdf report can be saved (it is rendered for Project Root Task Finish date):
		analysisResult.saveReport("AnalysisReport.pdf");
		//ExEnd: use-analysis
		

		

	}
}
