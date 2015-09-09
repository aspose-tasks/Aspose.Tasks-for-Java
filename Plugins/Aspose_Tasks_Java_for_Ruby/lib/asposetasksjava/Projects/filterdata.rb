module Asposetasksjava
  module FilterData
    def initialize()
        # Reading Filter Definition Data
        get_filter_definition_data()
    end

    def get_filter_definition_data()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        task_filters = project.getTaskFilters().toList()

        puts "Task Filters Count: " + task_filters.size().to_s
        puts "All Tasks: " + task_filters.get(0).getName().to_s
        puts "Task Item: " + task_filters.get(0).getFilterType().to_s
        puts "Task Filters Show In Menu: " + task_filters.get(0).getShowInMenu().to_s
        puts "Task filter ShowRelatedSummaryRows: "  + task_filters.get(0).getShowRelatedSummaryRows().to_s

        rsc_filters = project.getResourceFilters().toList()

        puts "Project.ResourceFilters count: " +  rsc_filters.size().to_s
        puts "Resource Filter Item Type: Item.ResourceType: "  + rsc_filters.get(0).getFilterType().to_s
        puts "Resource filter ShowInMenu"  + rsc_filters.get(0).getShowInMenu().to_s
        puts "Resource filter ShowRelatedSummaryRows: " + rsc_filters.get(0).getShowRelatedSummaryRows().to_s
    end
  end
end
