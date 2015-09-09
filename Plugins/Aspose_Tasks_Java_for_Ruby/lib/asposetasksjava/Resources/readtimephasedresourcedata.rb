module Asposetasksjava
  module ReadTimephasedResourceData
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

		# Get the Resource by its ID
		resource = project.getResources().getByUid(1)

		prj = Rjb::import('com.aspose.tasks.Prj')

		# Print Timephased data of ResourceWork
		puts "Timephased data of Resource Work"
		result = resource.getTimephasedData(project.get(prj.START_DATE), project.get(prj.FINISH_DATE)).toList()
		
		i = 0
		while i < result.size()	
			td = result.get(i)
		    puts "Start: " + td.getStart().toString()
		    puts "Work: " + td.getValue()
		    i +=1
		end
    end
  end
end
