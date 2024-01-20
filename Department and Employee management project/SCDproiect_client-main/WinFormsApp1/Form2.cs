using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WinFormsApp1
{
    public partial class Form2 : Form
    {
        EmployeeService employeeService;
        List<Employee> employeeList;

        public Form2()
        {
            InitializeComponent();
            employeeService = new EmployeeService();
            employeeService.createConnection();
        }

        private void button2_Click(object sender, EventArgs e) //go back
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)  //add employee
        {
            string Name = textBox1.Text;
            string Email = textBox2.Text;
            //int? ManagerId = string.IsNullOrEmpty(textBox3.Text) ? (int?)null : int.Parse(textBox3.Text);
            //int? DepartmentId = string.IsNullOrEmpty(textBox4.Text) ? (int?)null : int.Parse(textBox4.Text);

           
            Employee newEmployee = new Employee
            {
                name = Name,
                email = Email,
               // managerId = ManagerId,
               // departmentId = DepartmentId
               
            };

        }
    }
    }

