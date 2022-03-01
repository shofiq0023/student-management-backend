# Student Management App (Backend)

Creating an API to be consumed by fronend

### API endpoints:
- api/get/all -> get all student by id (Ascending order)
- api/get/all/desc -> get all student (Descending order)
- api/get/all/name -> get all student by student_name (Ascending order)
- api/get/all/name/desc -> get all student by student_name (Descending order)
- api/get/{id} -> get single student with student_id
- api/add -> adds a new student
- api/update -> update student detail
- api/delete/{id} -> deletes a student with student_id

### Response Data:
```
{
    "id": 9278986,
    "name": "John Doe"
    "email": "john.doe_867@gmail.com"
}
```