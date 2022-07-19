<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmCV
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.NuevoToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.CompraToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.VentaToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.InformaciónToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.IntegrantesToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ProblemaToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.tabcontrol = New System.Windows.Forms.TabControl()
        Me.tabVent = New System.Windows.Forms.TabPage()
        Me.btnVenta = New System.Windows.Forms.Button()
        Me.chkHeadsetV = New System.Windows.Forms.CheckBox()
        Me.chkKeyboardV = New System.Windows.Forms.CheckBox()
        Me.chkMouseV = New System.Windows.Forms.CheckBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtNombre = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.tabCompra = New System.Windows.Forms.TabPage()
        Me.btnCompra = New System.Windows.Forms.Button()
        Me.chkHeadsetC = New System.Windows.Forms.CheckBox()
        Me.chkKeyboardC = New System.Windows.Forms.CheckBox()
        Me.chkMouseC = New System.Windows.Forms.CheckBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.MenuStrip1.SuspendLayout()
        Me.tabcontrol.SuspendLayout()
        Me.tabVent.SuspendLayout()
        Me.tabCompra.SuspendLayout()
        Me.SuspendLayout()
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.NuevoToolStripMenuItem, Me.InformaciónToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(616, 24)
        Me.MenuStrip1.TabIndex = 0
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'NuevoToolStripMenuItem
        '
        Me.NuevoToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.CompraToolStripMenuItem, Me.VentaToolStripMenuItem})
        Me.NuevoToolStripMenuItem.Name = "NuevoToolStripMenuItem"
        Me.NuevoToolStripMenuItem.Size = New System.Drawing.Size(35, 20)
        Me.NuevoToolStripMenuItem.Text = "Ver"
        '
        'CompraToolStripMenuItem
        '
        Me.CompraToolStripMenuItem.Name = "CompraToolStripMenuItem"
        Me.CompraToolStripMenuItem.Size = New System.Drawing.Size(180, 22)
        Me.CompraToolStripMenuItem.Text = "Historial"
        '
        'VentaToolStripMenuItem
        '
        Me.VentaToolStripMenuItem.Name = "VentaToolStripMenuItem"
        Me.VentaToolStripMenuItem.Size = New System.Drawing.Size(180, 22)
        Me.VentaToolStripMenuItem.Text = "Stock"
        '
        'InformaciónToolStripMenuItem
        '
        Me.InformaciónToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.IntegrantesToolStripMenuItem, Me.ProblemaToolStripMenuItem})
        Me.InformaciónToolStripMenuItem.Name = "InformaciónToolStripMenuItem"
        Me.InformaciónToolStripMenuItem.Size = New System.Drawing.Size(84, 20)
        Me.InformaciónToolStripMenuItem.Text = "Información"
        '
        'IntegrantesToolStripMenuItem
        '
        Me.IntegrantesToolStripMenuItem.Name = "IntegrantesToolStripMenuItem"
        Me.IntegrantesToolStripMenuItem.Size = New System.Drawing.Size(133, 22)
        Me.IntegrantesToolStripMenuItem.Text = "Integrantes"
        '
        'ProblemaToolStripMenuItem
        '
        Me.ProblemaToolStripMenuItem.Name = "ProblemaToolStripMenuItem"
        Me.ProblemaToolStripMenuItem.Size = New System.Drawing.Size(133, 22)
        Me.ProblemaToolStripMenuItem.Text = "Problema"
        '
        'tabcontrol
        '
        Me.tabcontrol.Controls.Add(Me.tabVent)
        Me.tabcontrol.Controls.Add(Me.tabCompra)
        Me.tabcontrol.ItemSize = New System.Drawing.Size(200, 40)
        Me.tabcontrol.Location = New System.Drawing.Point(23, 47)
        Me.tabcontrol.Name = "tabcontrol"
        Me.tabcontrol.Padding = New System.Drawing.Point(18, 3)
        Me.tabcontrol.SelectedIndex = 0
        Me.tabcontrol.Size = New System.Drawing.Size(454, 309)
        Me.tabcontrol.TabIndex = 1
        '
        'tabVent
        '
        Me.tabVent.Controls.Add(Me.btnVenta)
        Me.tabVent.Controls.Add(Me.chkHeadsetV)
        Me.tabVent.Controls.Add(Me.chkKeyboardV)
        Me.tabVent.Controls.Add(Me.chkMouseV)
        Me.tabVent.Controls.Add(Me.Label2)
        Me.tabVent.Controls.Add(Me.txtNombre)
        Me.tabVent.Controls.Add(Me.Label1)
        Me.tabVent.Location = New System.Drawing.Point(4, 44)
        Me.tabVent.Name = "tabVent"
        Me.tabVent.Padding = New System.Windows.Forms.Padding(3)
        Me.tabVent.Size = New System.Drawing.Size(446, 261)
        Me.tabVent.TabIndex = 0
        Me.tabVent.Text = "Venta"
        Me.tabVent.UseVisualStyleBackColor = True
        '
        'btnVenta
        '
        Me.btnVenta.Location = New System.Drawing.Point(308, 209)
        Me.btnVenta.Name = "btnVenta"
        Me.btnVenta.Size = New System.Drawing.Size(118, 36)
        Me.btnVenta.TabIndex = 10
        Me.btnVenta.Text = "Realizar venta"
        Me.btnVenta.UseVisualStyleBackColor = True
        '
        'chkHeadsetV
        '
        Me.chkHeadsetV.AutoSize = True
        Me.chkHeadsetV.Location = New System.Drawing.Point(88, 175)
        Me.chkHeadsetV.Name = "chkHeadsetV"
        Me.chkHeadsetV.Size = New System.Drawing.Size(66, 17)
        Me.chkHeadsetV.TabIndex = 5
        Me.chkHeadsetV.Text = "Headset"
        Me.chkHeadsetV.UseVisualStyleBackColor = True
        '
        'chkKeyboardV
        '
        Me.chkKeyboardV.AutoSize = True
        Me.chkKeyboardV.Location = New System.Drawing.Point(88, 141)
        Me.chkKeyboardV.Name = "chkKeyboardV"
        Me.chkKeyboardV.Size = New System.Drawing.Size(71, 17)
        Me.chkKeyboardV.TabIndex = 4
        Me.chkKeyboardV.Text = "Keyboard"
        Me.chkKeyboardV.UseVisualStyleBackColor = True
        '
        'chkMouseV
        '
        Me.chkMouseV.AutoSize = True
        Me.chkMouseV.Location = New System.Drawing.Point(88, 109)
        Me.chkMouseV.Name = "chkMouseV"
        Me.chkMouseV.Size = New System.Drawing.Size(58, 17)
        Me.chkMouseV.TabIndex = 3
        Me.chkMouseV.Text = "Mouse"
        Me.chkMouseV.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(47, 81)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(58, 13)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Productos:"
        '
        'txtNombre
        '
        Me.txtNombre.Location = New System.Drawing.Point(119, 33)
        Me.txtNombre.Name = "txtNombre"
        Me.txtNombre.Size = New System.Drawing.Size(100, 20)
        Me.txtNombre.TabIndex = 1
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(17, 36)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(96, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Nombre de cliente:"
        '
        'tabCompra
        '
        Me.tabCompra.Controls.Add(Me.btnCompra)
        Me.tabCompra.Controls.Add(Me.chkHeadsetC)
        Me.tabCompra.Controls.Add(Me.chkKeyboardC)
        Me.tabCompra.Controls.Add(Me.chkMouseC)
        Me.tabCompra.Controls.Add(Me.Label4)
        Me.tabCompra.Location = New System.Drawing.Point(4, 44)
        Me.tabCompra.Name = "tabCompra"
        Me.tabCompra.Padding = New System.Windows.Forms.Padding(3)
        Me.tabCompra.Size = New System.Drawing.Size(446, 261)
        Me.tabCompra.TabIndex = 1
        Me.tabCompra.Text = "Compra"
        Me.tabCompra.UseVisualStyleBackColor = True
        '
        'btnCompra
        '
        Me.btnCompra.Location = New System.Drawing.Point(305, 215)
        Me.btnCompra.Name = "btnCompra"
        Me.btnCompra.Size = New System.Drawing.Size(115, 34)
        Me.btnCompra.TabIndex = 8
        Me.btnCompra.Text = "Realizar compra"
        Me.btnCompra.UseVisualStyleBackColor = True
        '
        'chkHeadsetC
        '
        Me.chkHeadsetC.AutoSize = True
        Me.chkHeadsetC.Location = New System.Drawing.Point(77, 149)
        Me.chkHeadsetC.Name = "chkHeadsetC"
        Me.chkHeadsetC.Size = New System.Drawing.Size(66, 17)
        Me.chkHeadsetC.TabIndex = 3
        Me.chkHeadsetC.Text = "Headset"
        Me.chkHeadsetC.UseVisualStyleBackColor = True
        '
        'chkKeyboardC
        '
        Me.chkKeyboardC.AutoSize = True
        Me.chkKeyboardC.Location = New System.Drawing.Point(77, 116)
        Me.chkKeyboardC.Name = "chkKeyboardC"
        Me.chkKeyboardC.Size = New System.Drawing.Size(71, 17)
        Me.chkKeyboardC.TabIndex = 2
        Me.chkKeyboardC.Text = "Keyboard"
        Me.chkKeyboardC.UseVisualStyleBackColor = True
        '
        'chkMouseC
        '
        Me.chkMouseC.AutoSize = True
        Me.chkMouseC.Location = New System.Drawing.Point(77, 82)
        Me.chkMouseC.Name = "chkMouseC"
        Me.chkMouseC.Size = New System.Drawing.Size(58, 17)
        Me.chkMouseC.TabIndex = 1
        Me.chkMouseC.Text = "Mouse"
        Me.chkMouseC.UseVisualStyleBackColor = True
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(43, 54)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(56, 13)
        Me.Label4.TabIndex = 0
        Me.Label4.Text = "Producto: "
        '
        'btnSalir
        '
        Me.btnSalir.BackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.btnSalir.FlatStyle = System.Windows.Forms.FlatStyle.Popup
        Me.btnSalir.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnSalir.Location = New System.Drawing.Point(496, 329)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(108, 41)
        Me.btnSalir.TabIndex = 2
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = False
        '
        'frmCV
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(616, 382)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.tabcontrol)
        Me.Controls.Add(Me.MenuStrip1)
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "frmCV"
        Me.Text = "CompraVenta"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.tabcontrol.ResumeLayout(False)
        Me.tabVent.ResumeLayout(False)
        Me.tabVent.PerformLayout()
        Me.tabCompra.ResumeLayout(False)
        Me.tabCompra.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents MenuStrip1 As MenuStrip
    Friend WithEvents NuevoToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents CompraToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents VentaToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents InformaciónToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents IntegrantesToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents ProblemaToolStripMenuItem As ToolStripMenuItem
    Friend WithEvents tabcontrol As TabControl
    Friend WithEvents tabVent As TabPage
    Friend WithEvents tabCompra As TabPage
    Friend WithEvents btnSalir As Button
    Friend WithEvents btnVenta As Button
    Friend WithEvents chkHeadsetV As CheckBox
    Friend WithEvents chkKeyboardV As CheckBox
    Friend WithEvents chkMouseV As CheckBox
    Friend WithEvents Label2 As Label
    Friend WithEvents txtNombre As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents chkHeadsetC As CheckBox
    Friend WithEvents chkKeyboardC As CheckBox
    Friend WithEvents chkMouseC As CheckBox
    Friend WithEvents Label4 As Label
    Friend WithEvents btnCompra As Button
End Class
