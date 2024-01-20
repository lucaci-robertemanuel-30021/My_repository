namespace WinFormsApp1
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            button1 = new Button();
            button2 = new Button();
            button3 = new Button();
            button4 = new Button();
            label2 = new Label();
            button5 = new Button();
            button6 = new Button();
            button7 = new Button();
            button8 = new Button();
            dataGridView1 = new DataGridView();
            button9 = new Button();
            ((System.ComponentModel.ISupportInitialize)dataGridView1).BeginInit();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Segoe UI", 13.8F, FontStyle.Regular, GraphicsUnit.Point);
            label1.Location = new Point(121, 9);
            label1.Name = "label1";
            label1.Size = new Size(124, 31);
            label1.TabIndex = 1;
            label1.Text = "Employees";
            // 
            // button1
            // 
            button1.Location = new Point(12, 52);
            button1.Name = "button1";
            button1.Size = new Size(151, 29);
            button1.TabIndex = 2;
            button1.Text = "View All";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Location = new Point(12, 98);
            button2.Name = "button2";
            button2.Size = new Size(151, 29);
            button2.TabIndex = 3;
            button2.Text = "Add Employee";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // button3
            // 
            button3.Location = new Point(191, 98);
            button3.Name = "button3";
            button3.Size = new Size(178, 29);
            button3.TabIndex = 4;
            button3.Text = "All Employees per Dep";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // button4
            // 
            button4.Location = new Point(191, 52);
            button4.Name = "button4";
            button4.Size = new Size(151, 29);
            button4.TabIndex = 5;
            button4.Text = "Delete Employee";
            button4.UseVisualStyleBackColor = true;
            button4.Click += button4_Click;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("Segoe UI", 13.8F, FontStyle.Regular, GraphicsUnit.Point);
            label2.Location = new Point(561, 9);
            label2.Name = "label2";
            label2.Size = new Size(147, 31);
            label2.TabIndex = 6;
            label2.Text = "Departments";
            // 
            // button5
            // 
            button5.Location = new Point(431, 52);
            button5.Name = "button5";
            button5.Size = new Size(151, 29);
            button5.TabIndex = 7;
            button5.Text = "View All";
            button5.UseVisualStyleBackColor = true;
            button5.Click += button5_Click;
            // 
            // button6
            // 
            button6.Location = new Point(607, 98);
            button6.Name = "button6";
            button6.Size = new Size(166, 29);
            button6.TabIndex = 8;
            button6.Text = "All managers per Dep";
            button6.UseVisualStyleBackColor = true;
            button6.Click += button6_Click;
            // 
            // button7
            // 
            button7.Location = new Point(431, 98);
            button7.Name = "button7";
            button7.Size = new Size(151, 29);
            button7.TabIndex = 9;
            button7.Text = "Add Department";
            button7.UseVisualStyleBackColor = true;
            button7.Click += button7_Click;
            // 
            // button8
            // 
            button8.Location = new Point(607, 52);
            button8.Name = "button8";
            button8.Size = new Size(151, 29);
            button8.TabIndex = 10;
            button8.Text = "Delete Department";
            button8.UseVisualStyleBackColor = true;
            button8.Click += button8_Click;
            // 
            // dataGridView1
            // 
            dataGridView1.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            dataGridView1.Location = new Point(12, 175);
            dataGridView1.Name = "dataGridView1";
            dataGridView1.RowHeadersWidth = 51;
            dataGridView1.RowTemplate.Height = 29;
            dataGridView1.Size = new Size(776, 263);
            dataGridView1.TabIndex = 11;
            // 
            // button9
            // 
            button9.Location = new Point(352, 133);
            button9.Name = "button9";
            button9.Size = new Size(94, 29);
            button9.TabIndex = 12;
            button9.Text = "Send Email";
            button9.UseVisualStyleBackColor = true;
            button9.Click += button9_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button9);
            Controls.Add(dataGridView1);
            Controls.Add(button8);
            Controls.Add(button7);
            Controls.Add(button6);
            Controls.Add(button5);
            Controls.Add(label2);
            Controls.Add(button4);
            Controls.Add(button3);
            Controls.Add(button2);
            Controls.Add(button1);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)dataGridView1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion
        private Label label1;
        private Button button1;
        private Button button2;
        private Button button3;
        private Button button4;
        private Label label2;
        private Button button5;
        private Button button6;
        private Button button7;
        private Button button8;
        private DataGridView dataGridView1;
        private Button button9;
    }
}