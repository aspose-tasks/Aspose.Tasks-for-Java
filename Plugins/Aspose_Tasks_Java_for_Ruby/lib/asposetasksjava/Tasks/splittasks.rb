module Asposetasksjava
  module SplitTasks
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        prj = Rjb::import('com.aspose.tasks.Prj')
        tsk = Rjb::import('com.aspose.tasks.Tsk')

        # Get a standard calendar
		calendar = project.get(prj.CALENDAR)

		# Set project's calendar settings
		cal = Rjb::import('java.util.Calendar').getInstance()
		cal.set(2011, 3, 15, 8, 0, 0)
		project.set(prj.START_DATE, cal.getTime())
		cal.set(2011, 3, 21, 17, 0, 0)
		project.set(prj.FINISH_DATE, cal.getTime())

		# root task
		rootTask = project.getRootTask()
		rootTask.set(tsk.NAME, "Root")

		# Add a new task
		taskToSplit = rootTask.getChildren().add("Task1")
		taskToSplit.set(tsk.DURATION, project.getDuration(3))

		# Create a new resource assignment
		splitResourceAssignment = project.getResourceAssignments().add(taskToSplit, nil)

		# Generate resource assignment timephased data
		splitResourceAssignment.timephasedDataFromTaskDuration(calendar)

		# Split the task into 3 parts.
		# Provide start date and finish date arguments to SplitTask method
		# These dates will be used for split
		# Set project's calendar settings
		cal = Rjb::import('java.util.Calendar').getInstance()
		cal2 = Rjb::import('java.util.Calendar').getInstance()

		cal.set(2011, 3, 16, 8, 0, 0)
		cal2.set(2011, 3, 16, 17, 0, 0)
		splitResourceAssignment.splitTask(cal.getTime(), cal2.getTime(), calendar)
		cal.set(2011, 3, 18, 8, 0, 0)
		cal2.set(2011, 3, 18, 17, 0, 0)
		splitResourceAssignment.splitTask(cal.getTime(), cal2.getTime(), calendar)
		splitResourceAssignment.set(Rjb::import('com.aspose.tasks.Asn').WORK_CONTOUR, Rjb::import('com.aspose.tasks.WorkContourType').Contoured)

		# Save the Project
		project.save(data_dir + "SplitTasks.xml", Rjb::import('com.aspose.tasks.SaveFileFormat').XML)
    end
  end
end
