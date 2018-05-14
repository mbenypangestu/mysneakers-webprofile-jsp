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
                Promo Produk
                <small>List data promo produk</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li><a href="#">Promo Produk</a></li>
            </ol>
        </section>

        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                            <a href="${pageContext.request.contextPath}/administrator/promo_produk/add" class="btn btn-bitbucket">
                                <i class="fa fa-plus-circle"></i> Tambah
                            </a>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <table id="example2" class="table table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th width="5%">No.</th>
                                    <th>Produk_id</th>
                                    <th>Diskon</th>
                                    <th>Harga_promo</th>
                                    <th width="15%">#</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>a</td>
                                    <td>b</td>
                                    <td>c</td>
                                    <td>d</td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/administrator/promo_produk/edit" class="btn btn-primary">
                                            <i class="fa fa-pencil"></i> Edit
                                        </a>
                                        <a href="${pageContext.request.contextPath}/administrator/promo_produk/delete" class="btn btn-danger">
                                            <i class="fa fa-times"></i> Hapus
                                        </a>
                                    </td>
                                </tr>
                                </tfoot>
                            </table>
                        </div>
                        <!-- /.box-body -->
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

</body>
</html>
