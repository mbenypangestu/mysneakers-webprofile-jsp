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
                Ubah Produk
                <small>Perubahan data produk</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li><a href="#">Produk</a></li>
                <li><a href="#">Ubah</a></li>
            </ol>
        </section>

        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box box-info">
                        <div class="box-header with-border">
                            <a href="${pageContext.request.contextPath}/administrator/produk" class="btn btn-default">
                                <i class="fa fa-arrow-left"></i> Kembali
                            </a>
                        </div>

                        <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/administrator/produk/edit">
                            <div class="box-body pad">
                                <div class="form-group">
                                    <label for="brand_id" class="col-sm-2 control-label">Brand_id</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="brand_id" name="brand_id" placeholder="id" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="nama" class="col-sm-2 control-label">Nama Produk (*)</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="nama" name="nama" placeholder="Nama Produk" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="deskripsi" class="col-sm-2 control-label">Deskripsi Produk (*)</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="deskripsi" name="deskripsi" placeholder="Deskripsi Produk" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="gambar" class="col-sm-2 control-label">Gambar</label>

                                    <div class="col-sm-8">
                                        <input type="file" class="form-control" id="gambar">
                                    </div>
                                    <div class="col-sm-8 col-sm-push-2">
                                        <img src="" id="gambar_preview" width="300px">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="jenis_id" class="col-sm-2 control-label">Jenis id</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="jenis_id" name="jenis_id" placeholder="id" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="bahan" class="col-sm-2 control-label">Bahan</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="bahan" name="bahan" placeholder="Bsahan Produk" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="harga" class="col-sm-2 control-label">Harga</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="harga" name="harga" placeholder="Harga" required>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="stok" class="col-sm-2 control-label">Stok</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="stok" name="stok" placeholder="Stok Produk" required>
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
