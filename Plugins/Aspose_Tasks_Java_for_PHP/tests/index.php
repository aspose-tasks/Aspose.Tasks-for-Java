<?php

require_once("../../java/Java.inc");

require_once __DIR__ . '/../vendor/autoload.php';

use Aspose\Tasks\WorkingWithProjects\CreateEmptyProject;
use Aspose\Tasks\WorkingWithProjects\CurrencyProperties;
use Aspose\Tasks\WorkingWithProjects\FilterData;
use Aspose\Tasks\WorkingWithProjects\FiscalYearProperties;
use Aspose\Tasks\WorkingWithProjects\GetNumberOfPages;
use Aspose\Tasks\WorkingWithProjects\ProjectProperties;
use Aspose\Tasks\WorkingWithProjects\ProjectVersion;
use Aspose\Tasks\WorkingWithProjects\ReadingGroupDefinitionData;
use Aspose\Tasks\WorkingWithProjects\ReadingTableData;
use Aspose\Tasks\WorkingWithProjects\SaveProjectAsPdf;
use Aspose\Tasks\WorkingWithProjects\SaveProjectDataToExcel;
use Aspose\Tasks\WorkingWithProjects\SaveProjectDataToOtherFormats;
use Aspose\Tasks\WorkingWithProjects\SetAttributesForNewTasks;
use Aspose\Tasks\WorkingWithProjects\UpdateProjectFile;
use Aspose\Tasks\WorkingWithProjects\VerifyProjectStructure;
use Aspose\Tasks\WorkingWithProjects\WeekdayProperties;

use Aspose\Tasks\WorkingWithCalendars\CalendarProperties;
use Aspose\Tasks\WorkingWithCalendars\CreateCalendar;
use Aspose\Tasks\WorkingWithCalendars\CreateStandardCalendar;
use Aspose\Tasks\WorkingWithCalendars\DefineWeekdaysForCalendar;

use Aspose\Tasks\WorkingWithCalendarExceptions\AddCalendarException;
use Aspose\Tasks\WorkingWithCalendarExceptions\DefineWeekdaysForExceptions;
use Aspose\Tasks\WorkingWithCalendarExceptions\HandleOccurrencesForExceptions;
use Aspose\Tasks\WorkingWithCalendarExceptions\RemoveCalendarException;

use Aspose\Tasks\WorkingWithTasks\CalculateTaskDuration;
use Aspose\Tasks\WorkingWithTasks\ChangeProgressOfTask;
use Aspose\Tasks\WorkingWithTasks\CriticalAndEffortDrivenTasks;
use Aspose\Tasks\WorkingWithTasks\GetBudgetWorkAndCostValue;
use Aspose\Tasks\WorkingWithTasks\GetTaskTimephasedData;
use Aspose\Tasks\WorkingWithTasks\HandlingPriorities;
use Aspose\Tasks\WorkingWithTasks\ManagingDuration;
use Aspose\Tasks\WorkingWithTasks\ManagingTaskCosts;
use Aspose\Tasks\WorkingWithTasks\ParentAndChildTasks;
use Aspose\Tasks\WorkingWithTasks\RenderTaskSheetView;
use Aspose\Tasks\WorkingWithTasks\RenderTaskUsageView;
use Aspose\Tasks\WorkingWithTasks\SplitTasks;
use Aspose\Tasks\WorkingWithTasks\StopAndResumeTask;
use Aspose\Tasks\WorkingWithTasks\TasksPercentage;
use Aspose\Tasks\WorkingWithTasks\TasksProperties;
use Aspose\Tasks\WorkingWithTasks\WbsAssociatedWithTask;

use Aspose\Tasks\WorkingWithTaskLinks\CreateTaskLink;
use Aspose\Tasks\WorkingWithTaskLinks\DefineLinkType;
use Aspose\Tasks\WorkingWithTaskLinks\PredecessorAndSuccessorTask;
use Aspose\Tasks\WorkingWithTaskLinks\UpdateTaskLink;

use Aspose\Tasks\WorkingWithTaskBaselines\CreateTaskBaseline;
use Aspose\Tasks\WorkingWithTaskBaselines\TaskBaselineDuration;
use Aspose\Tasks\WorkingWithTaskBaselines\TaskBaselineSchedule;

use Aspose\Tasks\WorkingWithResources\ExtendedResourceAttributes;
use Aspose\Tasks\WorkingWithResources\ReadTimephasedResourceData;
use Aspose\Tasks\WorkingWithResources\RenderResourceUsageAndSheetView;
use Aspose\Tasks\WorkingWithResources\ResourceCost;
use Aspose\Tasks\WorkingWithResources\SetResourceProperties;

use Aspose\Tasks\WorkingWithResourceAssignments\AssignmentBudget;
use Aspose\Tasks\WorkingWithResourceAssignments\AssignmentCost;
use Aspose\Tasks\WorkingWithResourceAssignments\AssignmentOvertimeAndRemainingCosts;
use Aspose\Tasks\WorkingWithResourceAssignments\AssignmentPercentWorkComplete;
use Aspose\Tasks\WorkingWithResourceAssignments\AssignmentVariance;
use Aspose\Tasks\WorkingWithResourceAssignments\CreateResourceAssignment;
use Aspose\Tasks\WorkingWithResourceAssignments\ResourceAssignmentProperties;
use Aspose\Tasks\WorkingWithResourceAssignments\StopAndResumeAssignment;

use Aspose\Tasks\WorkingWithCurrencies\CurrencyCodes;
use Aspose\Tasks\WorkingWithCurrencies\CurrencyDigits;
use Aspose\Tasks\WorkingWithCurrencies\CurrencySymbols;

print "Running Aspose\\Tasks\\WorkingWithProjects\\CreateEmptyProject::run()" . PHP_EOL;
CreateEmptyProject::run(__DIR__ . '/data/WorkingWithProjects/CreateEmptyProject/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\CurrencyProperties::run()" . PHP_EOL;
CurrencyProperties::run(__DIR__ . '/data/WorkingWithProjects/CurrencyProperties/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\FilterData::run()" . PHP_EOL;
FilterData::run(__DIR__ . '/data/WorkingWithProjects/FilterData/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\FiscalYearProperties::run()" . PHP_EOL;
FiscalYearProperties::run(__DIR__ . '/data/WorkingWithProjects/FiscalYearProperties/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\GetNumberOfPages::run()" . PHP_EOL;
GetNumberOfPages::run(__DIR__ . '/data/WorkingWithProjects/GetNumberOfPages/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\ProjectProperties::run()" . PHP_EOL;
ProjectProperties::run(__DIR__ . '/data/WorkingWithProjects/ProjectProperties/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\ProjectVersion::run()" . PHP_EOL;
ProjectVersion::run(__DIR__ . '/data/WorkingWithProjects/ProjectVersion/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\ReadingGroupDefinitionData::run()" . PHP_EOL;
ReadingGroupDefinitionData::run(__DIR__ . '/data/WorkingWithProjects/ReadingGroupDefinitionData/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\ReadingTableData::run()" . PHP_EOL;
ReadingTableData::run(__DIR__ . '/data/WorkingWithProjects/ReadingTableData/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\SaveProjectAsPdf::run()" . PHP_EOL;
SaveProjectAsPdf::run(__DIR__ . '/data/WorkingWithProjects/SaveProjectAsPdf/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\SaveProjectDataToExcel::run()" . PHP_EOL;
SaveProjectDataToExcel::run(__DIR__ . '/data/WorkingWithProjects/SaveProjectDataToExcel/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\SaveProjectDataToOtherFormats::run()" . PHP_EOL;
SaveProjectDataToOtherFormats::run(__DIR__ . '/data/WorkingWithProjects/SaveProjectDataToOtherFormats/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\SetAttributesForNewTasks::run()" . PHP_EOL;
SetAttributesForNewTasks::run(__DIR__ . '/data/WorkingWithProjects/SetAttributesForNewTasks/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\UpdateProjectFile::run()" . PHP_EOL;
UpdateProjectFile::run(__DIR__ . '/data/WorkingWithProjects/UpdateProjectFile/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\VerifyProjectStructure::run()" . PHP_EOL;
VerifyProjectStructure::run(__DIR__ . '/data/WorkingWithProjects/VerifyProjectStructure/');

print "Running Aspose\\Tasks\\WorkingWithProjects\\WeekdayProperties::run()" . PHP_EOL;
WeekdayProperties::run(__DIR__ . '/data/WorkingWithProjects/WeekdayProperties/');



print "Running Aspose\\Tasks\\WorkingWithCalendars\\CalendarProperties::run()" . PHP_EOL;
CalendarProperties::run(__DIR__ . '/data/WorkingWithCalendars/CalendarProperties/');

print "Running Aspose\\Tasks\\WorkingWithCalendars\\CreateCalendar::run()" . PHP_EOL;
CreateCalendar::run(__DIR__ . '/data/WorkingWithCalendars/CreateCalendar/');

print "Running Aspose\\Tasks\\WorkingWithCalendars\\CreateStandardCalendar::run()" . PHP_EOL;
CreateStandardCalendar::run(__DIR__ . '/data/WorkingWithCalendars/CreateStandardCalendar/');

print "Running Aspose\\Tasks\\WorkingWithCalendars\\DefineWeekdaysForCalendar::run()" . PHP_EOL;
DefineWeekdaysForCalendar::run(__DIR__ . '/data/WorkingWithCalendars/DefineWeekdaysForCalendar/');



print "Running Aspose\\Tasks\\WorkingWithCalendarExceptions\\AddCalendarException::run()" . PHP_EOL;
AddCalendarException::run(__DIR__ . '/data/WorkingWithCalendarExceptions/AddCalendarException/');

print "Running Aspose\\Tasks\\WorkingWithCalendarExceptions\\DefineWeekdaysForExceptions::run()" . PHP_EOL;
DefineWeekdaysForExceptions::run(__DIR__ . '/data/WorkingWithCalendarExceptions/DefineWeekdaysForExceptions/');

print "Running Aspose\\Tasks\\WorkingWithCalendarExceptions\\HandleOccurrencesForExceptions::run()" . PHP_EOL;
HandleOccurrencesForExceptions::run(__DIR__ . '/data/WorkingWithCalendarExceptions/HandleOccurrencesForExceptions/');

print "Running Aspose\\Tasks\\WorkingWithCalendarExceptions\\RemoveCalendarException::run()" . PHP_EOL;
RemoveCalendarException::run(__DIR__ . '/data/WorkingWithCalendarExceptions/RemoveCalendarException/');



print "Running Aspose\\Tasks\\WorkingWithTasks\\CalculateTaskDuration::run()" . PHP_EOL;
CalculateTaskDuration::run(__DIR__ . '/data/WorkingWithTasks/CalculateTaskDuration/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\ChangeProgressOfTask::run()" . PHP_EOL;
ChangeProgressOfTask::run(__DIR__ . '/data/WorkingWithTasks/ChangeProgressOfTask/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\CriticalAndEffortDrivenTasks::run()" . PHP_EOL;
CriticalAndEffortDrivenTasks::run(__DIR__ . '/data/WorkingWithTasks/CriticalAndEffortDrivenTasks/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\GetBudgetWorkAndCostValue::run()" . PHP_EOL;
GetBudgetWorkAndCostValue::run(__DIR__ . '/data/WorkingWithTasks/GetBudgetWorkAndCostValue/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\GetTaskTimephasedData::run()" . PHP_EOL;
GetTaskTimephasedData::run(__DIR__ . '/data/WorkingWithTasks/GetTaskTimephasedData/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\HandlingPriorities::run()" . PHP_EOL;
HandlingPriorities::run(__DIR__ . '/data/WorkingWithTasks/HandlingPriorities/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\ManagingDuration::run()" . PHP_EOL;
ManagingDuration::run(__DIR__ . '/data/WorkingWithTasks/ManagingDuration/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\ManagingTaskCosts::run()" . PHP_EOL;
ManagingTaskCosts::run(__DIR__ . '/data/WorkingWithTasks/ManagingTaskCosts/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\ParentAndChildTasks::run()" . PHP_EOL;
ParentAndChildTasks::run(__DIR__ . '/data/WorkingWithTasks/ParentAndChildTasks/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\RenderTaskSheetView::run()" . PHP_EOL;
RenderTaskSheetView::run(__DIR__ . '/data/WorkingWithTasks/RenderTaskSheetView/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\RenderTaskUsageView::run()" . PHP_EOL;
RenderTaskUsageView::run(__DIR__ . '/data/WorkingWithTasks/RenderTaskUsageView/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\StopAndResumeTask::run()" . PHP_EOL;
StopAndResumeTask::run(__DIR__ . '/data/WorkingWithTasks/StopAndResumeTask/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\TasksPercentage::run()" . PHP_EOL;
TasksPercentage::run(__DIR__ . '/data/WorkingWithTasks/TasksPercentage/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\TasksProperties::run()" . PHP_EOL;
TasksProperties::run(__DIR__ . '/data/WorkingWithTasks/TasksProperties/');

print "Running Aspose\\Tasks\\WorkingWithTasks\\WbsAssociatedWithTask::run()" . PHP_EOL;
WbsAssociatedWithTask::run(__DIR__ . '/data/WorkingWithTasks/WbsAssociatedWithTask/');



print "Running Aspose\\Tasks\\WorkingWithTaskLinks\\CreateTaskLink::run()" . PHP_EOL;
CreateTaskLink::run(__DIR__ . '/data/WorkingWithTaskLinks/CreateTaskLink/');

print "Running Aspose\\Tasks\\WorkingWithTaskLinks\\DefineLinkType::run()" . PHP_EOL;
DefineLinkType::run(__DIR__ . '/data/WorkingWithTaskLinks/DefineLinkType/');

print "Running Aspose\\Tasks\\WorkingWithTaskLinks\\PredecessorAndSuccessorTask::run()" . PHP_EOL;
PredecessorAndSuccessorTask::run(__DIR__ . '/data/WorkingWithTaskLinks/PredecessorAndSuccessorTask/');

print "Running Aspose\\Tasks\\WorkingWithTaskLinks\\UpdateTaskLink::run()" . PHP_EOL;
UpdateTaskLink::run(__DIR__ . '/data/WorkingWithTaskLinks/UpdateTaskLink/');



print "Running Aspose\\Tasks\\WorkingWithTaskBaselines\\CreateTaskBaseline::run()" . PHP_EOL;
CreateTaskBaseline::run(__DIR__ . '/data/WorkingWithTaskBaselines/CreateTaskBaseline/');

print "Running Aspose\\Tasks\\WorkingWithTaskBaselines\\TaskBaselineDuration::run()" . PHP_EOL;
TaskBaselineDuration::run(__DIR__ . '/data/WorkingWithTaskBaselines/TaskBaselineDuration/');

print "Running Aspose\\Tasks\\WorkingWithTaskBaselines\\TaskBaselineSchedule::run()" . PHP_EOL;
TaskBaselineSchedule::run(__DIR__ . '/data/WorkingWithTaskBaselines/TaskBaselineSchedule/');



print "Running Aspose\\Tasks\\WorkingWithResources\\ExtendedResourceAttributes::run()" . PHP_EOL;
ExtendedResourceAttributes::run(__DIR__ . '/data/WorkingWithResources/ExtendedResourceAttributes/');

print "Running Aspose\\Tasks\\WorkingWithResources\\ReadTimephasedResourceData::run()" . PHP_EOL;
ReadTimephasedResourceData::run(__DIR__ . '/data/WorkingWithResources/ReadTimephasedResourceData/');

print "Running Aspose\\Tasks\\WorkingWithResources\\RenderResourceUsageAndSheetView::run()" . PHP_EOL;
RenderResourceUsageAndSheetView::run(__DIR__ . '/data/WorkingWithResources/RenderResourceUsageAndSheetView/');

print "Running Aspose\\Tasks\\WorkingWithResources\\ResourceCost::run()" . PHP_EOL;
ResourceCost::run(__DIR__ . '/data/WorkingWithResources/ResourceCost/');

print "Running Aspose\\Tasks\\WorkingWithResources\\SetResourceProperties::run()" . PHP_EOL;
SetResourceProperties::run(__DIR__ . '/data/WorkingWithResources/SetResourceProperties/');



print "Running Aspose\\Tasks\\WorkingWithResourceAssignments\\AssignmentBudget::run()" . PHP_EOL;
AssignmentBudget::run(__DIR__ . '/data/WorkingWithResourceAssignments/AssignmentBudget/');

print "Running Aspose\\Tasks\\WorkingWithResourceAssignments\\AssignmentCost::run()" . PHP_EOL;
AssignmentCost::run(__DIR__ . '/data/WorkingWithResourceAssignments/AssignmentCost/');

print "Running Aspose\\Tasks\\WorkingWithResourceAssignments\\AssignmentOvertimeAndRemainingCosts::run()" . PHP_EOL;
AssignmentOvertimeAndRemainingCosts::run(__DIR__ . '/data/WorkingWithResourceAssignments/AssignmentOvertimeAndRemainingCosts/');

print "Running Aspose\\Tasks\\WorkingWithResourceAssignments\\AssignmentPercentWorkComplete::run()" . PHP_EOL;
AssignmentPercentWorkComplete::run(__DIR__ . '/data/WorkingWithResourceAssignments/AssignmentPercentWorkComplete/');

print "Running Aspose\\Tasks\\WorkingWithResourceAssignments\\AssignmentPercentWorkComplete::run()" . PHP_EOL;
AssignmentVariance::run(__DIR__ . '/data/WorkingWithResourceAssignments/AssignmentVariance/');

print "Running Aspose\\Tasks\\WorkingWithResourceAssignments\\CreateResourceAssignment::run()" . PHP_EOL;
CreateResourceAssignment::run(__DIR__ . '/data/WorkingWithResourceAssignments/CreateResourceAssignment/');

print "Running Aspose\\Tasks\\WorkingWithResourceAssignments\\ResourceAssignmentProperties::run()" . PHP_EOL;
ResourceAssignmentProperties::run(__DIR__ . '/data/WorkingWithResourceAssignments/ResourceAssignmentProperties/');

print "Running Aspose\\Tasks\\WorkingWithResourceAssignments\\StopAndResumeAssignment::run()" . PHP_EOL;
StopAndResumeAssignment::run(__DIR__ . '/data/WorkingWithResourceAssignments/StopAndResumeAssignment/');

print "Running Aspose\\Tasks\\WorkingWithCurrencies\\CurrencyCodes::run()" . PHP_EOL;
CurrencyCodes::run(__DIR__ . '/data/WorkingWithCurrencies/CurrencyCodes/');