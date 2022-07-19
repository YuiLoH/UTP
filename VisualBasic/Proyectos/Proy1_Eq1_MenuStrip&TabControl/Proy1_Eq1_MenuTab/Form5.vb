Public Class frmStock
    Private Sub frmStock_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        txtMouseS.Text = frmCV.stockmouse
        txtKeyboardS.Text = frmCV.stockkeyboard
        txtHeadsetS.Text = frmCV.stockheadset

    End Sub

    Private Sub btnCerrar_Click(sender As Object, e As EventArgs) Handles btnCerrar.Click
        Me.Close()


    End Sub
End Class