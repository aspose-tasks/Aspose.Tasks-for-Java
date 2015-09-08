module Asposetasksjava
  module ReadingTableData
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        t1 = project.getTables().toList().get(0)
        puts "Table Fields Count" + t1.getTableFields().size().to_s

        f = t1.getTableFields().get(0)
        puts "Field width: " + f.getWidth().to_s
        puts "Field Title: " + f.getTitle().to_s
        puts "Field Title Alignment: " + f.getAlignTitle().to_s
        puts "Field Align Data: " + f.getAlignData().to_s

        f = t1.getTableFields().get(1)
        puts "Field width: " + f.getWidth().to_s
        puts "Field Title: " + f.getTitle().to_s
        puts "Field Title Alignment: " + f.getAlignTitle().to_s
        puts "Field Align Data: " + f.getAlignData().to_s
    end
  end
end
