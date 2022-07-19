Public Class frmCV
    Public mousevendido As Integer
    Public keyboardvendido As Integer
    Public headsetvendido As Integer
    Public mousecomprado As Integer
    Public keyboardcomprado As Integer
    Public headsetcomprado As Integer
    Public nombre As String
    Public stockmouse As Integer = 100
    Public stockkeyboard As Integer = 100
    Public stockheadset As Integer = 100
    Public historial As String = ""


    Private Sub IntegrantesToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles IntegrantesToolStripMenuItem.Click
        frmInfo.Show()

    End Sub

    Private Sub ProblemaToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ProblemaToolStripMenuItem.Click
        frmProblema.Show()

    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        End

    End Sub

    Private Sub CompraToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles CompraToolStripMenuItem.Click
        frmHistorial.Show()

    End Sub

    Private Sub VentaToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles VentaToolStripMenuItem.Click
        frmStock.Show()

    End Sub

    Private Sub btnVenta_Click(sender As Object, e As EventArgs) Handles btnVenta.Click
        nombre = txtNombre.Text
        Dim texto1 As String = ""
        Dim texto2 As String = ""
        Dim texto3 As String = ""
        If chkMouseV.CheckState = CheckState.Checked Then
            mousevendido = InputBox("Cantidad de mouse vendido:", "Venta")
            texto1 = CStr(mousevendido) + " mouse,"
            stockmouse -= mousevendido
        End If
        If chkKeyboardV.CheckState = CheckState.Checked Then
            keyboardvendido = InputBox("Cantidad de keyboard vendido:", "Venta")
            texto2 = CStr(keyboardvendido) + " keyboard,"
            stockkeyboard -= keyboardvendido
        End If
        If chkHeadsetV.CheckState = CheckState.Checked Then
            headsetvendido = InputBox("Cantidad de headset vendido:", "Venta")
            texto3 = CStr(headsetvendido) + " headset,"
            stockheadset -= headsetvendido
        End If
        historial = "Se ha vendido " & texto1 & texto2 & texto3 & " a " & nombre
        frmHistorial.txtHistorial.Text = frmHistorial.txtHistorial.Text & vbNewLine + historial

        MsgBox("La venta fue realizada con éxito.", vbOKOnly, "Venta")

        txtNombre.Text = ""
        chkMouseV.CheckState = CheckState.Unchecked
        chkKeyboardV.CheckState = CheckState.Unchecked
        chkHeadsetV.CheckState = CheckState.Unchecked


    End Sub

    Private Sub btnCompra_Click(sender As Object, e As EventArgs) Handles btnCompra.Click
        Dim texto1 As String = ""
        Dim texto2 As String = ""
        Dim texto3 As String = ""
        If chkMouseC.CheckState = CheckState.Checked Then
            mousecomprado = InputBox("Cantidad de mouse comprado:", "Compra")
            texto1 = CStr(mousecomprado) + " mouse,"
            stockmouse += mousecomprado
        End If
        If chkKeyboardC.CheckState = CheckState.Checked Then
            keyboardcomprado = InputBox("Cantidad de keyboard comprado:", "Compra")
            texto2 = CStr(keyboardcomprado) + " keyboard,"
            stockkeyboard += keyboardcomprado
        End If
        If chkHeadsetC.CheckState = CheckState.Checked Then
            headsetcomprado = InputBox("Cantidad de headset comprado:", "Compra")
            texto3 = CStr(headsetcomprado) + " headset,"
            stockheadset += headsetcomprado
        End If
        historial = "Se ha comprado " & texto1 & texto2 & texto3 & " y se actualizó la cantidades en existencia "
        frmHistorial.txtHistorial.Text = frmHistorial.txtHistorial.Text & vbNewLine + historial

        MsgBox("La compra fue realizada con éxito.", vbOKOnly, "Compra")

        chkMouseC.CheckState = CheckState.Unchecked
        chkKeyboardC.CheckState = CheckState.Unchecked
        chkHeadsetC.CheckState = CheckState.Unchecked
    End Sub
End Class
