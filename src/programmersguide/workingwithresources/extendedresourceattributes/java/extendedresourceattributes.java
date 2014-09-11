/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithresources.extendedresourceattributes.java;

import com.aspose.tasks.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;


public class extendedresourceattributes
{

    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithresources/extendedresourceattributes/data/";


            Project project = new Project();

            //First resource of type Work
            Resource rsc = project.addResource("Resource 1");

            //Set Extended attributes to the resource
            SetResourceExtAttributes(rsc);

            project.save(dataDir+ "ResourceWithExtAttribs.xml", SaveFileFormat.XML);
        }

        private static void SetResourceExtAttributes(Resource rsc)
        {
            rsc.setType(ResourceType.Material);
            rsc.setBookingType(BookingType.Proposed);
            rsc.setMaterialLabel("TEST LABEL>");
            rsc.isGeneric(true);
            rsc.setEmailAddress(null);// = null;
            rsc.setNtAccount(null);
            rsc.setMaxUnits(0.0);// = double.NaN;
            rsc.setAccrueAt(CostAccrualType.Start);
            rsc.setExtendedAttribute(new ArrayList<ExtendedAttribute>(16));
            //rsc.setExtendedAttribute = new ArrayList(16);

            java.util.Calendar calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            calendar.set(2013, java.util.Calendar.DECEMBER, 17, 0, 0, 0);
            Date startDate = calendar.getTime();
            calendar.set(2013, java.util.Calendar.DECEMBER, 24, 0, 0, 0);
            Date finishDate = calendar.getTime();
            calendar.set(2013, java.util.Calendar.DECEMBER, 9, 0, 0, 0);
            Date nowDate = calendar.getTime();

            ExtendedAttribute attr = new ExtendedAttribute();
            attr.setFieldId(Integer.toString(ExtendedAttributeResource.Text1));
            attr.setValue("TEXT VALUE 1");
            rsc.getExtendedAttribute().add(attr);

            attr = new ExtendedAttribute();
            attr.setFieldId(Integer.toString(ExtendedAttributeResource.Cost3));
            attr.setValue("12345.6");
            rsc.getExtendedAttribute().add(attr);

            attr = new ExtendedAttribute();
            attr.setFieldId(Integer.toString(ExtendedAttributeResource.Start1));
            attr.setValue(startDate.toString());
            rsc.getExtendedAttribute().add(attr);

            attr = new ExtendedAttribute();
            attr.setFieldId(Integer.toString(ExtendedAttributeResource.Finish1));
            attr.setValue(finishDate.toString());
            rsc.getExtendedAttribute().add(attr);

            attr = new ExtendedAttribute();
            attr.setFieldId(Integer.toString(ExtendedAttributeResource.Number1));
            attr.setValue("321");
            rsc.getExtendedAttribute().add(attr);

            attr = new ExtendedAttribute();
            attr.setFieldId(Integer.toString(ExtendedAttributeResource.Date1));
            attr.setValue(nowDate.toString());
            rsc.getExtendedAttribute().add(attr);

            attr = new ExtendedAttribute();
            attr.setFieldId(Integer.toString(ExtendedAttributeResource.Duration1));
            attr.setValue("1800");
            rsc.getExtendedAttribute().add(attr);

            attr = new ExtendedAttribute();
            attr.setFieldId(Integer.toString(ExtendedAttributeResource.Flag1));
            attr.setValue("1");
            rsc.getExtendedAttribute().add(attr);

        }



}





