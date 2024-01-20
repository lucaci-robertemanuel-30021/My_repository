using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace WinFormsApp1
{
    internal class DepartmentService
    {
        static HttpClient client = new HttpClient();

        public void createConnection()
        {
            // Update port # in the following line.
            client.BaseAddress = new Uri("http://localhost:8082/");
            client.DefaultRequestHeaders.Accept.Clear();
            client.DefaultRequestHeaders.Accept.Add(
                new MediaTypeWithQualityHeaderValue("application/json"));
        }

        public List<Department> GetDepartments()
        {
            List<Department> departments = null;
            HttpResponseMessage response = client.GetAsync("department").Result;
            if (response.IsSuccessStatusCode)
            {
                string resultString = response.Content.ReadAsStringAsync().Result;
                Console.WriteLine("gata : " + resultString);

                //to ignore the null fields(parentId)
                var ignoreNull = new Newtonsoft.Json.JsonSerializerSettings
                {
                    NullValueHandling = Newtonsoft.Json.NullValueHandling.Ignore
                };

                departments = JsonConvert.DeserializeObject<List<Department>>(resultString, ignoreNull);
                return departments;

            }
            return null;
        }

        public bool AddDepartment(Department newDepartment)
        {

            var ignoreNull = new Newtonsoft.Json.JsonSerializerSettings
            {
                NullValueHandling = Newtonsoft.Json.NullValueHandling.Ignore
            };

            string jsonDepartment = JsonConvert.SerializeObject(newDepartment, ignoreNull);
            StringContent content = new StringContent(jsonDepartment, Encoding.UTF8, "application/json");

            HttpResponseMessage response = client.PostAsync("department", content).Result;

            return response.IsSuccessStatusCode;

        }

        public bool UpdateDepartment(Employee updatedDepartment)
        {
            var ignoreNull = new Newtonsoft.Json.JsonSerializerSettings
            {
                NullValueHandling = Newtonsoft.Json.NullValueHandling.Ignore
            };

            string jsonDepartment = JsonConvert.SerializeObject(updatedDepartment, ignoreNull);
            StringContent content = new StringContent(jsonDepartment, Encoding.UTF8, "application/json");

            int departmentId = updatedDepartment.id;

            HttpResponseMessage response = client.PutAsync($"employee/{departmentId}", content).Result;

            if (response.IsSuccessStatusCode)
            {
                return true;
            }
            else
            {
                Console.WriteLine("Failed to update department. Status code: " + response.StatusCode);
                return false;
            }
        }

        public bool DeleteDepartment(int departmentId)
        {
            HttpResponseMessage response = client.DeleteAsync($"department/{departmentId}").Result;

            if (response.IsSuccessStatusCode)
            {
                return true;
            }
            else
            {
                Console.WriteLine("Failed to delete department. Status code: " + response.StatusCode);
                return false;
            }
        }
    }
}

