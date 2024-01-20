async function getEmployees() {
    const response = await fetch("http://localhost:8082/employee");
    const res = await response.json();
    for(i=0;i<res.length;i++){
        console.log(res[i])

        let table = document.getElementById("employeeTable");

        let row = table.insertRow(-1);
        let c1 = row.insertCell(0);
        let c2 = row.insertCell(1);
        let c3 = row.insertCell(2);
        let c4 = row.insertCell(3);
        let c5 = row.insertCell(4);
        c1.innerText = res[i].name;

        if(res[i].departmentId!=null)
        c2.innerText = res[i].departmentId;
    else
    c2.innerText = "null";

    if(res[i].managerId!=null)
    c3.innerText = res[i].managerId;
else
c3.innerText = "null";

        c4.innerText = res[i].email;

    if(res[i].id!=null)
        c5.innerText = res[i].id;
    else
    c5.innerText = "null";
   }
    console.log(res[1]);
  }

  async function addEmployee() {
        try {
            const response = await fetch("http://localhost:8082/employee", {
                method: 'POST',
                body: JSON.stringify({
                    name: document.getElementById("name").value,
                    departmentId: document.getElementById("departmentId").value,
                    managerId: document.getElementById("managerId").value,
                    email: document.getElementById("email").value,
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

async function deleteEmployee() {
      try {
          var id2=document.getElementById("id_delete2").value;
          const response = await fetch("http://localhost:8082/employee/"+id2, {
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
