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
                Tambah User
                <small>Penambahan data user</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li><a href="#">User</a></li>
                <li><a href="#">Tambah</a></li>
            </ol>
        </section>

        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box box-info">
                        <div class="box-header with-border">
                            <a href="${pageContext.request.contextPath}/administrator/user" class="btn btn-default">
                                <i class="fa fa-arrow-left"></i> Kembali
                            </a>
                        </div>

                        <form class="form-horizontal" method="post" action="${pageContext.request.contextPath}/administrator/user/add">
                            <div class="box-body pad">

                                <div class="form-group">
                                    <label for="nama" class="col-sm-2 control-label">Nama</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="nama" name="nama" placeholder="nama">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="username" class="col-sm-2 control-label">Username</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="username" name="username" placeholder="Username">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="email" class="col-sm-2 control-label">Email</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="email" name="email" placeholder="Email">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="password" class="col-sm-2 control-label">Password</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="password" name="password" placeholder="Password">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="remembertoken" class="col-sm-2 control-label">Remember_token</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="remembertoken" name="remembertoken" placeholder="token">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="alamat" class="col-sm-2 control-label">Alamat</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="alamat" name="alamat" placeholder="Alamat">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="telp" class="col-sm-2 control-label">Telp</label>

                                    <div class="col-sm-8">
                                        <input type="text" class="form-control" id="telp" name="telp" placeholder="Telp">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="foto" class="col-sm-2 control-label">Foto</label>

                                    <div class="col-sm-8">
                                        <input type="file" class="form-control" id="foto">
                                    </div>
                                    <div class="col-sm-8 col-sm-push-2">
                                        <img src="" id="foto_preview" width="300px">
                                    </div>
                                </div>

                            </div>

                            <div class="box-footer">
                                <div class="col-sm-10">
                                    <button type="submit" class="btn btn-bitbucket pull-right">
                                        <i class="fa fa-plus-circle"></i> Tambah
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
