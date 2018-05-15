<!-- sidebar: style can be found in sidebar.less -->
<section class="sidebar">
    <!-- Sidebar user panel -->
    <div class="user-panel">
        <div class="pull-left image">
            <img src="/admin/dist/img/sneaker-305322_1280.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
            <p>Administrator</p>
            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
    </div>
    <!-- search form -->
    <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
            <input type="text" name="q" class="form-control" placeholder="Search...">
            <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
    </form>
    <!-- /.search form -->
    <!-- sidebar menu: : style can be found in sidebar.less -->
    <ul class="sidebar-menu">
        <li><a href="${pageContext.request.contextPath}/administrator"><i class="fa fa-circle-o text-red"></i> <span>Dashboard</span></a></li>
        <li class="header">Data Master</li>
        <li><a href="${pageContext.request.contextPath}/administrator/artikel"><i class="fa fa-circle-o text-red"></i> <span>Artikel</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/brand"><i class="fa fa-circle-o text-red"></i> <span>Brand</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/jenis"><i class="fa fa-circle-o text-red"></i> <span>Jenis Produk</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/kategori_produk"><i class="fa fa-circle-o text-red"></i> <span>Kategori Produk</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/notifikasi"><i class="fa fa-circle-o text-red"></i> <span>Notifikasi</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/warna"><i class="fa fa-circle-o text-red"></i> <span>Warna</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/size_produk"><i class="fa fa-circle-o text-red"></i> <span>Size Produk</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/warna_produk"><i class="fa fa-circle-o text-red"></i> <span>Warna Produk</span></a></li>

        <li class="header">Transaksi Produk</li>
        <li><a href="${pageContext.request.contextPath}/administrator/produk"><i class="fa fa-circle-o text-red"></i> <span>Produk</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/promo_produk"><i class="fa fa-circle-o text-red"></i> <span>Promo Produk</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/order"><i class="fa fa-circle-o text-red"></i> <span>Order</span></a></li>

        <li class="header">Managemen Users</li>
        <li><a href="${pageContext.request.contextPath}/administrator/role_user"><i class="fa fa-circle-o text-red"></i> <span>Role User</span></a></li>
        <li><a href="${pageContext.request.contextPath}/administrator/user"><i class="fa fa-circle-o text-red"></i> <span>User</span></a></li>
    </ul>
</section>
<!-- /.sidebar -->