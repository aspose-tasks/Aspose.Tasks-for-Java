module Asposetasksjava
  module TaskBaselineDuration
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
        
        onesec = 10000000
        onemin = 60 * onesec
        onehour = 60 * onemin
        
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new
		
    		# Creating TaskBaseline:
        task = project.getRootTask().getChildren().add("Task")
        project.setBaseline(Rjb::import('com.aspose.tasks.BaselineType').Baseline)

        baseline = task.getBaselines().toList().get(0)
        duration = baseline.getDuration().toDouble()
        baseline_duration = duration / onehour
        puts baseline_duration
    end
  end
end
