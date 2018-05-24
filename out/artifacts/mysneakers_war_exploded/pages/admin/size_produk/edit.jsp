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
<<<<<<< HEAD
                Ubah Size Produk
                <small>Perubahan data size produk</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li><a href="#">Size Produk</a></li>
                <li><a href="#">Ubah</a></li>
=======
                Tambah Artikel
                <small>Penambahan data artikel</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li><a href="#">Artikel</a></li>
                <li><a href="#">Tambah</a></li>
>>>>>>> e07d9d783bd12f4fb4c83a8d18272348e36eb759
            </ol>
        </section>

        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box box-info">
                        <div class="box-header with-border">
<<<<<<< HEAD
                            <a href="${pageContext.request.contextPath}/administrator/size_produk" class="btn btn-default">
=======
                            <a href="${pageContext.request.contextPath}/administrator/artikel" class="btn btn-default">
>>>>>>> e07d9d783bd12f4fb4c83a8d18272348e36eb759
                                <i class="fa fa-arrow-left"></i> Kembali
                            </a>
                        </div>

<<<<<<< HEAD
                        <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/administrator/size_produk/edit">
                            <div class="box-body pad">
                                <div class="form-group">
                                    <label for="produk_id" class="col-sm-2 control-label">Produk_id</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="produk_id" name="produk_id" placeholder="Produk id" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="size_id" class="col-sm-2 control-label">Size_id</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="size_id" name="size_id" placeholder="Size id" required>
=======
                        <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/administrator/artikel/add">
                            <div class="box-body pad">
                                <div class="form-group">
                                    <label for="judul" class="col-sm-2 control-label">Judul Artikel (*)</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="judul" name="judul" placeholder="Judul">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="konten" class="col-sm-2 control-label">Konten</label>

                                    <div class="col-sm-8">
                                        <textarea id="konten" name="konten" rows="10" cols="80">
                                            Tulis artikelmu disini !
                                        </textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="gambar" class="col-sm-2 control-label">Gambar</label>

                                    <div class="col-sm-8">
                                        <input type="file" class="form-control" id="gambar">
                                    </div>
                                    <div class="col-sm-8 col-sm-push-2">
                                        <img src="" id="gambar_preview" width="300px">
>>>>>>> e07d9d783bd12f4fb4c83a8d18272348e36eb759
                                    </div>
                                </div>
                            </div>

                            <div class="box-footer">
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-bitbucket pull-right">
<<<<<<< HEAD
                                        <i class="fa fa-plus-circle"></i> Ubah
=======
                                        <i class="fa fa-plus-circle"></i> Tambah
>>>>>>> e07d9d783bd12f4fb4c83a8d18272348e36eb759
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
