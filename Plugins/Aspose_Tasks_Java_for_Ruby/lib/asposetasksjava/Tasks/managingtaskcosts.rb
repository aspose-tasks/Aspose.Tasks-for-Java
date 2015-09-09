module Asposetasksjava
  module ManagingTaskCosts
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        task = project.getRootTask().getChildren().add("Task")

        tsk = Rjb::import('com.aspose.tasks.Tsk')

    	task.set(tsk.COST, Rjb::import('java.math.BigDecimal').valueOf(800))

    	puts "Task Remaining Cost: " + task.get(tsk.REMAINING_COST).to_string
    	puts "Task Fixed Cost: " + task.get(tsk.FIXED_COST).to_string
    	puts "Task Cost Variance: " + task.get(tsk.COST_VARIANCE).to_string
    	puts "Project Cost: " + project.getRootTask().get(tsk.COST).to_string
    	puts "Project Fixed Cost: " + project.getRootTask().get(tsk.FIXED_COST).to_string
    	puts "Project Remaining Cost: " + project.getRootTask().get(tsk.REMAINING_COST).to_string
    	puts "Project Variance Cost: " + project.getRootTask().get(tsk.COST_VARIANCE).to_string
    end
  end
end
