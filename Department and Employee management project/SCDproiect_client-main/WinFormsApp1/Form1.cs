namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        EmployeeService employeeService;
        List<Employee> employeeList;

        DepartmentService departmentService;
        List<Department> departmentList;

        public Form1()
        {
            InitializeComponent();
            StartPosition = FormStartPosition.CenterScreen;
            employeeService = new EmployeeService();
            employeeService.createConnection();

            departmentService = new DepartmentService();
            departmentService.createConnection();

        }

        private void button1_Click(object sender, EventArgs e) //get all Employees
        {
            var employeeList = employeeService.GetEmployees();

            dataGridView1.DataSource = employeeList;
        }

        private void button5_Click(object sender, EventArgs e) //get all Departments
        {
            var departmentList = departmentService.GetDepartments();

            dataGridView1.DataSource = departmentList;

        }

        //the employee ones

        //esentially done tho
        private void button2_Click(object sender, EventArgs e) // add employee
        {
            // Form2 form2 = new Form2();
            // form2.ShowDialog();   doesnt work ;((

            TextBox nameTextBox = new TextBox();
            TextBox emailTextBox = new TextBox();
            TextBox departmentIdTextBox = new TextBox();
            TextBox managerIdTextBox = new TextBox();

            var form = new Form
            {
                Text = "Add employee",
                Size = new System.Drawing.Size(400, 400),
                FormBorderStyle = FormBorderStyle.FixedDialog,
                MaximizeBox = true,
                MinimizeBox = true,
                StartPosition = FormStartPosition.CenterScreen
            };

            Label nameLabel = new Label
            {
                Text = "Name:",
                Location = new System.Drawing.Point(40, 80)
            };
            form.Controls.Add(nameLabel);

            nameTextBox.Location = new System.Drawing.Point(140, 80);
            form.Controls.Add(nameTextBox);

            Label emailLabel = new Label
            {
                Text = "Email:",
                Location = new System.Drawing.Point(40, 120)
            };
            form.Controls.Add(emailLabel);

            emailTextBox.Location = new System.Drawing.Point(140, 120);
            form.Controls.Add(emailTextBox);


            Label departmentIdLabel = new Label
            {
                Text = "Department Id:",
                Location = new System.Drawing.Point(40, 160)
            };
            form.Controls.Add(departmentIdLabel);

            departmentIdTextBox.Location = new System.Drawing.Point(140, 160);
            form.Controls.Add(departmentIdTextBox);


            Label managerIdLabel = new Label
            {
                Text = "Manager Id:",
                Location = new System.Drawing.Point(40, 200)
            };
            form.Controls.Add(managerIdLabel);

            managerIdTextBox.Location = new System.Drawing.Point(140, 200);
            form.Controls.Add(managerIdTextBox);


            Button okButton = new Button
            {
                Text = "Add",
                DialogResult = DialogResult.OK,
                Location = new System.Drawing.Point(100, 280)
            };
            form.Controls.Add(okButton);


            Button cancelButton = new Button
            {
                Text = "Go back",
                DialogResult = DialogResult.Cancel,
                Location = new System.Drawing.Point(200, 280)
            };
            form.Controls.Add(cancelButton);

            if (form.ShowDialog() == DialogResult.OK)
            {
                Employee newEmployee = new Employee
                {
                    name = nameTextBox.Text,
                    email = emailTextBox.Text,
                    departmentId = departmentIdTextBox.Text,
                    managerId = managerIdTextBox.Text
                };

                bool addedSuccessfully = employeeService.AddEmployee(newEmployee);

                if (addedSuccessfully)
                {
                    var updatedEmployeeList = employeeService.GetEmployees();

                    dataGridView1.DataSource = updatedEmployeeList;
                }
                else
                {
                    MessageBox.Show("Failed to add employee.");
                }
            }


        }

        //todo
        private void button3_Click(object sender, EventArgs e)  //all employees per department
        {

        }

        //done
        private void button4_Click(object sender, EventArgs e) //delete employee
        {
            if (dataGridView1.SelectedRows.Count > 0)
            {
                Employee selectedEmployee = (Employee)dataGridView1.SelectedRows[0].DataBoundItem;

                bool deletedSuccessfully = employeeService.DeleteEmployee(selectedEmployee.id);

                if (deletedSuccessfully)
                {
                    var updatedEmployeeList = employeeService.GetEmployees();

                    dataGridView1.DataSource = updatedEmployeeList;
                }
                else
                {
                    MessageBox.Show("Cannot delete employee");
                }
            }
            else
            {
                MessageBox.Show("Select the employee you want to delete");
            }
        }

        //the department ones
        //maybe work on this too

        //esentially done tho
        private void button7_Click(object sender, EventArgs e) // add department
        {
            //Form3 form3 = new Form3();
            //form3.ShowDialog();

            TextBox descriptionTextBox = new TextBox();
            TextBox parentIdTextBox = new TextBox();

            var form = new Form
            {
                Text = "Add department",
                Size = new System.Drawing.Size(400, 400),
                FormBorderStyle = FormBorderStyle.FixedDialog,
                MaximizeBox = true,
                MinimizeBox = true,
                StartPosition = FormStartPosition.CenterScreen
            };

            Label descriptionLabel = new Label
            {
                Text = "Description:",
                Location = new System.Drawing.Point(40, 80)
            };
            form.Controls.Add(descriptionLabel);

            descriptionTextBox.Location = new System.Drawing.Point(140, 80);
            form.Controls.Add(descriptionTextBox);


            Label parentIdLabel = new Label
            {
                Text = "Parent ID:",
                Location = new System.Drawing.Point(40, 120)
            };
            form.Controls.Add(parentIdLabel);

            parentIdTextBox.Location = new System.Drawing.Point(140, 120);
            form.Controls.Add(parentIdTextBox);

            Button okButton = new Button
            {
                Text = "Add",
                DialogResult = DialogResult.OK,
                Location = new System.Drawing.Point(100, 160)
            };
            form.Controls.Add(okButton);


            Button cancelButton = new Button
            {
                Text = "Go back",
                DialogResult = DialogResult.Cancel,
                Location = new System.Drawing.Point(200, 160)
            };
            form.Controls.Add(cancelButton);

            if (form.ShowDialog() == DialogResult.OK)
            {
                Department newDepartment = new Department
                {
                    description = descriptionTextBox.Text,
                    parentId = parentIdTextBox.Text

                };

                bool addedSuccessfully = departmentService.AddDepartment(newDepartment);

                if (addedSuccessfully)
                {
                    var updatedDepartmentList = departmentService.GetDepartments();

                    dataGridView1.DataSource = updatedDepartmentList;
                }
                else
                {
                    MessageBox.Show("Failed to add department.");
                }
            }
        }

        private void button6_Click(object sender, EventArgs e) //all managers per department
        {

        }

        //done
        private void button8_Click(object sender, EventArgs e) //delete department
        {
            if (dataGridView1.SelectedRows.Count > 0)
            {
                Department selectedDepartment = (Department)dataGridView1.SelectedRows[0].DataBoundItem;

                bool deletedSuccessfully = departmentService.DeleteDepartment(selectedDepartment.id);

                if (deletedSuccessfully)
                {
                    var updatedDepartmentList = departmentService.GetDepartments();

                    dataGridView1.DataSource = updatedDepartmentList;
                }
                else
                {
                    MessageBox.Show("Cannot delete department");
                }
            }
            else
            {
                MessageBox.Show("Select the department you want to delete");
            }

        }

        private void button9_Click(object sender, EventArgs e) //send email
        {

        }
    }
}