module Asposetasksjava
  module FiscalYearProperties
    def initialize()
        # Reading Fiscal Year Properties
        get_fiscal_year_properties()

        # Writing Fiscal Year Properties 
        set_fiscal_year_properties()
    end

    def get_fiscal_year_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        prj = Rjb::import('com.aspose.tasks.Prj')

        # Display fiscal year properties
        puts "Fiscal Year Start Date : " + project.get(prj.FY_START_DATE).toString()
        puts "Fiscal Year Numbering : " + project.get(prj.FISCAL_YEAR_START).toString()
    end

    def set_fiscal_year_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        prj = Rjb::import('com.aspose.tasks.Prj')

        # Set fiscal year properties
        project.set(prj.FY_START_DATE, Rjb::import('com.aspose.tasks.Month').July)
        project.set(prj.FISCAL_YEAR_START, Rjb::import('com.aspose.tasks.NullableBool').new(true))

        project.save(data_dir + "fiscal_year_properties.xml", Rjb::import('com.aspose.tasks.SaveFileFormat').XML)

        puts "Set fiscal year properties, please check the output file."
    end
  end
end
