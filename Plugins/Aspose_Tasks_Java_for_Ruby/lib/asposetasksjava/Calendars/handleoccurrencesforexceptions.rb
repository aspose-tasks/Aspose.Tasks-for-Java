module Asposetasksjava
  module HandleOccurrencesForExceptions
    def initialize()
        except = Rjb::import('com.aspose.tasks.CalendarException').new
        except.setEnteredByOccurrences(true)
        except.setOccurrences(5)
        except.setType(Rjb::import('com.aspose.tasks.CalendarExceptionType').YearlyByDay)

        puts "Set Occurences for exeptions"
    end
  end
end
