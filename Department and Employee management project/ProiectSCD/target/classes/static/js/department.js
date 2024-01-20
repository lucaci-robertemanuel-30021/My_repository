async function getDepartments() {
    const response = await fetch("http://localhost:8082/department");
    const res = await response.json();
    for(i=0;i<res.length;i++){
        console.log(res[i])

        let table = document.getElementById("departmentTable");

        let row = table.insertRow(-1);
        let c1 = row.insertCell(0);
        let c2 = row.insertCell(1);
        let c3 = row.insertCell(2);
        c1.innerText = res[i].description;

        if(res[i].parentId!=null)
        c2.innerText = res[i].parentId;
    else
    c2.innerText = "null";

    if(res[i].id!=null)
    c3.innerText = res[i].id;
else
c3.innerText = "null";
    }
    console.log(res[1]);
  }

  async function addDepartment() {
      try {
          const response = await fetch("http://localhost:8082/department", {
              method: 'POST',
              body: JSON.stringify({
                  description: document.getElementById("description").value,
                  parentId: document.getElementById("parentId").value,

              }),
              headers: {
                  'Content-Type': 'application/json; charset=UTF-8',
              },
          });
          if (!response.ok) {
              throw new Error('Network response was not ok');
          }
          const responseData = await response.json();
          console.log(responseData);

      } catch (error) {
          console.error('Error:', error);
      }
  }

  async function deleteDepartment() {

      try {
          var id=document.getElementById("id_delete").value;
          const response = await fetch("http://localhost:8082/department/"+id, {
              method: 'DELETE',
              headers: {
                  'Content-Type': 'application/json; charset=UTF-8',
              },
          });

          if (!response.ok) {
              throw new Error('Network response was not ok');
          }

          const responseData = await response.json();
          console.log(responseData);

      } catch (error) {
         console.error('Error:', error);
      }
  }

  async function modifyDepartment(id) {
      try {
          const departmentId = document.getElementById("departmentTable").value;

          const response = await fetch("http://localhost:8082/department/${id}", {
              method: 'PUT',
              body: JSON.stringify({
                  description: document.getElementById("modifyDescription").value,
                  parentId: document.getElementById("modifyParentId").value,
              }),
              headers: {
                  'Content-Type': 'application/json; charset=UTF-8',
              },
          });

          if (!response.ok) {
              throw new Error('Network response was not ok');
          }

          const responseData = await response.json();
          console.log(responseData);

      } catch (error) {
          console.error('Error:', error);
      }
  }
