module Asposetasksjava
  module CurrencyDigits
    def initialize()
    	# Getting Currency Digits
    	get_currency_digits()

    	# Getting Currency Digits
    	set_currency_digits()
    end

    def get_currency_digits()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        puts "Currency Digits: " + project.get(Rjb::import('com.aspose.tasks.Prj').CURRENCY_DIGITS).to_string
    end

    def set_currency_digits()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        project.set(Rjb::import('com.aspose.tasks.Prj').CURRENCY_DIGITS, 2)

        project.save(data_dir + "ProjectCurrDigits.mpp", Rjb::import('com.aspose.tasks.SaveFileFormat').MPP)

        puts "Set currency digits."
    end
  end
end
