module Asposetasksjava
  module SaveProjectAsPdf
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        options = Rjb::import('com.aspose.tasks.PdfSaveOptions').new

        # Set the LegendOnEachPage property to false to hide legends

        # Set the row height to fit cell content
        options.setFitContent(true)
        options.setTimescale(Rjb::import('com.aspose.tasks.Timescale').Months)
        options.setPresentationFormat(Rjb::import('com.aspose.tasks.PresentationFormat').TaskUsage)
        options.setLegendOnEachPage(false)
        project.save(data_dir + "project.pdf", options)

        puts "Saved project as pdf, please check the output file."
    end
  end
end
