module Asposetasksjava
  module ResourceAssignmentProperties
    def initialize()
      # Getting General Resource Assignment Properties 
      get_resource_assignments()

      # Setting General Resource Assignment Properties 
      set_resource_assignments()
    end
    
    def get_resource_assignments()  
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        resource_assignments = project.getResourceAssignments().toList()

        # Parse through all the collected resource assignments
        i = 0
        while i < resource_assignments.size()
          ra = resource_assignments.get(i)
          puts ra.get(Rjb::import('com.aspose.tasks.Asn').UID).to_string
          puts ra.get(Rjb::import('com.aspose.tasks.Asn').START).to_string
          puts ra.get(Rjb::import('com.aspose.tasks.Asn').FINISH).to_string
          puts "--------------------------------------------------------"
          i +=1
        end    
    end

    def set_resource_assignments()  
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        task = project.getRootTask().getChildren().add("Task")
        rsc = project.getResources().add("Rsc")
        rsc.set(Rjb::import('com.aspose.tasks.Rsc').STANDARD_RATE, Rjb::import('java.math.BigDecimal').valueOf(10))
        rsc.set(Rjb::import('com.aspose.tasks.Rsc').OVERTIME_RATE, Rjb::import('java.math.BigDecimal').valueOf(15))

        assn = project.getResourceAssignments().add(task, rsc)

        puts "Set resource assignment properties."
    end
  end
end
