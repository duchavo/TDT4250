IGNORE tdt4250.studyplan folder

# Classes

## StudyPlan
The root class contains all the other EClasses

```

## StudyYear
Class containing study year and a semester reference, course reference, 
specialization reference, and a courseGroup reference.

```


## Specialization
Class containing a specialization name, semester reference, specialization reference, courseGroup reference


```


## Semester
Class containing a semesterNr, course reference, semesterType enum, courseGroup reference


```


## CourseGroup
Class containing courseStatusType enum, semester reference, course reference


```


## Course
Class containing courseName, courseCode, credit, courseGroup reference



```



## SemesterType
Enum for FALL and SPRING



```


## CourseStatusType
Enum for course status: MANDATORY, ELECTIVE



```

# Constraints
maxSpecLength: Check length of the name of a specialzation
maxCredit: Check the sum of credits for a semester (Not yet implemented)
maxNameLength: Check length of name of a course
isValidCredit: Check if the credit is correct
isValidCode: Check if course code is correct


## Transformation M2T
M2T with Acceleo

Locate the .mtl file and Launch Acceleo Application (Doesn't work)


