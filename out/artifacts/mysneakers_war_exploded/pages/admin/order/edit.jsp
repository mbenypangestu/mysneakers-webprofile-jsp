<!DOCTYPE html>
<html>
<head>
    <jsp:include page="../includes/_head.jsp"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <header class="main-header">
        <jsp:include page="../includes/_header.jsp"/>
    </header>

    <aside class="main-sidebar">
        <jsp:include page="../includes/_sidebar.jsp"/>
    </aside>

    <div class="content-wrapper">
        <section class="content-header">
            <h1>
                Ubah Order
                <small>Perubahan data order</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li><a href="#">Order</a></li>
                <li><a href="#">Ubah</a></li>
            </ol>
        </section>

        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box box-info">
                        <div class="box-header with-border">
                            <a href="${pageContext.request.contextPath}/administrator/order" class="btn btn-default">
                                <i class="fa fa-arrow-left"></i> Kembali
                            </a>
                        </div>

                        <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/administrator/order/edit">
                            <div class="box-body pad">
                                <div class="form-group">
                                    <label for="tgl_order" class="col-sm-2 control-label">Tanggal Order</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="tgl_order" name="tgl_order" placeholder="Tanggal" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="total" class="col-sm-2 control-label">Total</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="total" name="total" placeholder="Total" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="status_kirim" class="col-sm-2 control-label">Status Kirim</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="status_kirim" name="status_kirim" placeholder="Status" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="status_terima" class="col-sm-2 control-label">Status Terima</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="status_terima" name="status_terima" placeholder="Status" required>
                                    </div>
                                </div>
                            </div>

                            <div class="box-footer">
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-bitbucket pull-right">
                                        <i class="fa fa-plus-circle"></i> Ubah
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>

    </div>

    <footer class="main-footer">
        <jsp:include page="../includes/_footer.jsp"/>
    </footer>
</div>

<jsp:include page="../includes/_js.jsp"/>

<script>
    $(function () {
        // Replace the <textarea id="editor1"> with a CKEditor
        // instance, using default configuration.
        CKEDITOR.replace('konten')
        //bootstrap WYSIHTML5 - text editor
        $('.textarea').wysihtml5()
    })
</script>

</body>
</html>
