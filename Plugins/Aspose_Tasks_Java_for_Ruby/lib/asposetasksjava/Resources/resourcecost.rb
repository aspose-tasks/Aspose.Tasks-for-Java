module Asposetasksjava
  module ResourceCost
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'project.mpp')

		resources = project.getResources().toList()

		rsc = Rjb::import('com.aspose.tasks.Rsc')

		# Parse through all the collected tasks
		i = 0
		while i < resources.size()
			resource = resources.get(i)
		    if resource.get(rsc.NAME) != nil
				puts "Cost: " + resource.get(rsc.COST).to_string
			    puts "ACWP: " + resource.get(rsc.ACWP).to_string
			    puts "BCWS: " + resource.get(rsc.BCWS).to_string
			    puts "BCWP: " + resource.get(rsc.BCWP).to_string
			    puts "---------------------------------------------"
			end
		    i +=1
		end
    end
  end
end
