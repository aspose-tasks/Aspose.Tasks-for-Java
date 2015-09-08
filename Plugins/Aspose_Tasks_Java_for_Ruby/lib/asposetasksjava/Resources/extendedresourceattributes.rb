module Asposetasksjava
  module ExtendedResourceAttributes
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

		res = project.getResources().toList().get(0)

		ea = Rjb::import('com.aspose.tasks.ExtendedAttribute').new
		ea.setFieldId("11")
		ea.setValue("MyValueEA")
		ea.setValueGuid("MyValueGuidEA")
		res.getExtendedAttributes().add(ea)

		puts "Set extended resource attributes."
    end
  end
end
