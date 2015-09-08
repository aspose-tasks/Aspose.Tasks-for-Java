module Asposetasksjava
  module SetResourceProperties
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

		# Resource properties are represented by static class Rsc
		rsc = project.getResources().add("Rsc")
		
		# set resource properties
		rsc.set(Rjb::import('com.aspose.tasks.Rsc').STANDARD_RATE, Rjb::import('java.math.BigDecimal').valueOf(15))
		rsc.set(Rjb::import('com.aspose.tasks.Rsc').OVERTIME_RATE, Rjb::import('java.math.BigDecimal').valueOf(20))

		puts "Set resource properties"
    end
  end
end
