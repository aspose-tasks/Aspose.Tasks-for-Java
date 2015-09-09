module Asposetasksjava
  module CurrencyCodes
    def initialize()
    	# Getting Currency Code
    	get_currency_code()

    	# Getting Currency Code
    	set_currency_code()
    end

    def get_currency_code()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        puts "Currency Code: " + project.get(Rjb::import('com.aspose.tasks.Prj').CURRENCY_CODE).to_string
    end

    def set_currency_code()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        project.set(Rjb::import('com.aspose.tasks.Prj').CURRENCY_CODE, "USD")

        puts "Set currency code."
    end
  end
end
