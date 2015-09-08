module Asposetasksjava
  module GetTaskTimephasedData
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        prj = Rjb::import('com.aspose.tasks.Prj')
        tsk = Rjb::import('com.aspose.tasks.Tsk')

        cal = Rjb::import('java.util.Calendar').getInstance()
		cal.set(2013,7,17,8,0,0)
		project.set(prj.START_DATE, cal.getTime())
		project.set(prj.NEW_TASKS_ARE_MANUAL, Rjb::import('com.aspose.tasks.NullableBool').new(false))

		task = project.getRootTask().getChildren().add("Task")
		rsc = project.getResources().add("Rsc")
		rsc.set(Rjb::import('com.aspose.tasks.Rsc').STANDARD_RATE, Rjb::import('java.math.BigDecimal').valueOf(10))
		rsc.set(Rjb::import('com.aspose.tasks.Rsc').OVERTIME_RATE, Rjb::import('java.math.BigDecimal').valueOf(15))
		# 6 days duration
		task.set(tsk.DURATION, project.getDuration(6))

		assn = project.getResourceAssignments().add(task, rsc)
		d = Rjb::import('java.util.Date').new(0)
		assn.set(Rjb::import('com.aspose.tasks.Asn').STOP, Rjb::import('java.util.Date').new(0))
		assn.set(Rjb::import('com.aspose.tasks.Asn').RESUME, Rjb::import('java.util.Date').new(0))

		# backloaded contour increases task duration from 6 to 10 days
		assn.set(Rjb::import('com.aspose.tasks.Asn').WORK_CONTOUR, Rjb::import('com.aspose.tasks.WorkContourType').BackLoaded)

		project.setBaseline(Rjb::import('com.aspose.tasks.BaselineType').Baseline)

		task.set(tsk.PERCENT_COMPLETE, 50)

		td = assn.getTimephasedData(assn.get(Rjb::import('com.aspose.tasks.Asn').START), 
									assn.get(Rjb::import('com.aspose.tasks.Asn').FINISH), 
									Rjb::import('com.aspose.tasks.TimephasedDataType').AssignmentRemainingWork).toList()

		puts "Size: " + td.size().to_s
		puts "Value: " + td.get(0).getValue().to_s
    end
  end
end
