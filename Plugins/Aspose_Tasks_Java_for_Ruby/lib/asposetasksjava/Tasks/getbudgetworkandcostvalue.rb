module Asposetasksjava
  module GetBudgetWorkAndCostValue
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        project_summary = project.getRootTask()

        tsk = Rjb::import('com.aspose.tasks.Tsk')
        rsc = Rjb::import('com.aspose.tasks.Rsc')

		puts "Project Budget Work = " + project_summary.get(tsk.BUDGET_WORK).to_string
		puts "Project Budget Cost = " + project_summary.get(tsk.BUDGET_COST).to_string

		# Get resource by Uid
		resource = project.getResources().getByUid(1)

		# Display resource budget work
		puts "Resource BudgetWork = " + resource.get(rsc.BUDGET_WORK).to_string

		# Get next resource by Uid
		resource = project.getResources().getByUid(2)

		# Display resource budget cost
		puts "Resource BudgetCost = " + resource.get(rsc.BUDGET_COST).to_string
    end
  end
end
