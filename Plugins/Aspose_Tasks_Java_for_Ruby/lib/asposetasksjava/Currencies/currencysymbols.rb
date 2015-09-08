module Asposetasksjava
  module CurrencySymbols
    def initialize()
    	# Getting Currency Symbol
    	get_currency_symbol()

    	# Getting Currency Symbol
    	set_currency_symbol()
    end

    def get_currency_symbol()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        puts "Currency Symbol: " + project.get(Rjb::import('com.aspose.tasks.Prj').CURRENCY_SYMBOL).to_string
    end

    def set_currency_symbol()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        project.set(Rjb::import('com.aspose.tasks.Prj').CURRENCY_SYMBOL, "$$")

        project.save(data_dir + "ProjectCurrSymbols.mpp", Rjb::import('com.aspose.tasks.SaveFileFormat').MPP)

        puts "Set currency symbol."
    end
  end
end
