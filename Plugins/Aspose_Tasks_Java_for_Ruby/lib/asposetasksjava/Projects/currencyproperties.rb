module Asposetasksjava
  module CurrencyProperties
    def initialize()
        # Reading Currency Properties
        get_currency_properties()

        # Writing Currency Properties 
        set_currency_properties()
    end

    def get_currency_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        prj = Rjb::import('com.aspose.tasks.Prj')

        # Display currency properties
        puts "Currency Code : " + project.get(prj.CURRENCY_CODE).toString()
        puts "<br>Currency Digits : " + project.get(prj.CURRENCY_DIGITS).toString()
        puts "<br>Currency Symbol : " + project.get(prj.CURRENCY_SYMBOL).toString()
        puts "Currency Symbol Position: " + project.get(prj.CURRENCY_SYMBOL_POSITION).toString()
    end

    def set_currency_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        prj = Rjb::import('com.aspose.tasks.Prj')

        # Set currency properties
        project.set(prj.CURRENCY_CODE, "AUD")
        project.set(prj.CURRENCY_DIGITS, 2)
        project.set(prj.CURRENCY_SYMBOL, "$")
        project.set(prj.CURRENCY_SYMBOL_POSITION, Rjb::import('com.aspose.tasks.CurrencySymbolPositionType').After)

        project.save(data_dir + "currency_properties.xml", Rjb::import('com.aspose.tasks.SaveFileFormat').XML)

        puts "Set currency properties, please check the output file."
    end
  end
end
