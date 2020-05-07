package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import EntityClass.*;
import DB.FacadeKasir;

public final class kasir_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/web/header.jsp");
    _jspx_dependants.add("/web/footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../template/css/bootstrap.min.css\">\n");
      out.write("        <title>Sistem Penjualan Apotek</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"/PWEB1/web/index.jsp\">Sistem Penjualan Apotek</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                ");
role.LoginData login = (role.LoginData) session.getAttribute("loginData");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    ");
 if(login==null){
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item disabled\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"/PWEB1/web/gudang.jsp\">Gudang</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item disabled\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"/PWEB1/web/kasir.jsp\">Kasir</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item disabled\">\n");
      out.write("                            <a class=\"nav-link disabled\" href=\"/PWEB1/web/pemilik.jsp\">Laporan</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"login.jsp\"><button class=\"btn btn-outline-success my-2 my-sm-0\">Login</button></a>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"/PWEB1/web/gudang.jsp\">Gudang</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"/PWEB1/web/kasir.jsp\">Kasir</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"/PWEB1/web/pemilik.jsp\">Laporan</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"/PWEB1/web/logout.jsp\"><button class=\"btn btn-outline-success my-2 my-sm-0\">Logout</button></a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>                    \n");
      out.write("        </nav>\n");
      out.write("                <br/>\n");
      out.write("    <br/>\n");
      out.write("        <!-- End Header-->");
      out.write("\n");
      out.write("        ");
if (login == null) {
      out.write("\n");
      out.write("        <center><h1>Silahkan Login Untuk Mengakses</h1></center>\n");
      out.write("        ");
 } else if (login.getGroup()!=2) {
      out.write("\n");
      out.write("        <center><h1>Halaman Ini Tidak Bisa Di Akses</h1></center>\n");
      out.write("        ");
 } else {
      out.write("\n");
      out.write("\n");
      out.write("\n");

    FacadeKasir fc = new FacadeKasir();
    Barang[] daftarBarang = fc.getDaftarBarang();

      out.write("\n");
      out.write("        <datalist id=\"list\">\n");
      out.write("            ");
for(int i=0;i<daftarBarang.length;++i){
      out.write("\n");
      out.write("            <option>");
      out.print(daftarBarang[i].getNama_barang());
      out.write("</option>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </datalist>\n");
      out.write("        <script>\n");
      out.write("            function cari(){\n");
      out.write("                var nama=document.getElementById(\"nama_barang\").value;\n");
      out.write("                location.href=\"kasir.jsp?nama_barang=\"+nama;\n");
      out.write("            }\n");
      out.write("        </script>\n");

    Barang barang=new Barang();
    if(request.getParameter("nama_barang")!=null)
    {
        String nama=request.getParameter("nama_barang");
        barang=fc.getDataBarang(nama);
    }
    
    Keranjang[] daftarKeranjang=fc.getKeranjang(login.getId());

      out.write('\n');
      out.write('\n');

//    String[] nama_barang = null;
//    int[] jml_barang= null;
//    int[] harga_barang= null;
//    int[] subharga= null;
//    for (int i = 0; i < daftarBarang.length; i++) {   
//        nama_barang[i] = daftarBarang[i].getNama_barang();
//        jml_barang[i] = daftarBarang[i].getStok()
//    }

      out.write("\n");
      out.write("        <div class=\"container py-2\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search\" id=\"nama_barang\" list=\"list\">\n");
      out.write("                <div class=\"input-group-append\" id=\"button-addon4\">\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"button\" onclick=\"cari()\">Cari</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
 String pesan = (String)session.getAttribute("pesan");
        if (pesan != null) {
      out.write("\n");
      out.write("            <div class=\"alert alert-info alert-dismissible fade show\" role=\"alert\">\n");
      out.write("                <strong>");
      out.print(pesan);
      out.write("</strong>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            ");
 session.setAttribute("pesan", null);
            }
      out.write("\n");
      out.write("    ");
if(request.getParameter("nama_barang")!=null&&barang.getNama_barang().equals("")){
      out.write("\n");
      out.write("        <div id=\"nama_barang\" class=\"container alert alert-danger alert-dismissible fade show\" role=\"alert\">\n");
      out.write("            <strong>Data tidak ditemukan!</strong>&nbsp;\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"alert\" >\n");
      out.write("                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("              </button>\n");
      out.write("        </div>\n");
      out.write("    ");
}else if (!barang.getNama_barang().equals("")){
      out.write("\n");
      out.write("        <div class=\"container alert alert-info alert-dismissible fade show\" role=\"alert\">\n");
      out.write("            <strong>Data ditemukan!</strong>&nbsp;\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"alert\" >\n");
      out.write("                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("              </button>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <form action=\"../tambahKeranjang\" method=\"post\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <input type=\"hidden\" name=\"id_barang\" value=\"");
      out.print(barang.getId_barang());
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"id_akun\" value=\"");
      out.print(login.getId());
      out.write("\">\n");
      out.write("                    <input type=\"number\" min=\"0\" max=\"");
      out.print(barang.getStok());
      out.write("\" name=\"jumlah_barang\" class=\"form-control\" placeholder=\"Masukkan jumlah barang\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-success\" class=\"form-control\" value=\"Tambah ke Checkout\">\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <table class=\"table text-center\">\n");
      out.write("            <tr>\n");
      out.write("                ");

                    int total = 0;
                    for (int i = 0; i < daftarKeranjang.length; i++) {
                        Barang c = fc.getBarang(daftarKeranjang[i].getId_barang());
                        total += c.getHarga() * daftarKeranjang[i].getJumlah();
                    }
                
      out.write("\n");
      out.write("                <td><h2 align=\"\">Checkout</h2></td>\n");
      out.write("                <td colspan=\"5\"><h3 align=\"\">Total Harga : Rp.");
      out.print(total);
      out.write("</h3></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>No</th>\n");
      out.write("                <th>Nama Barang</th>\n");
      out.write("                <th>Jumlah</th>\n");
      out.write("                <th>Harga</th>\n");
      out.write("                <th>Subtotal Harga</th>\n");
      out.write("                <th>Aksi</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (int k = 0; k < daftarKeranjang.length; ++k) {
                    Barang b = fc.getBarang(daftarKeranjang[k].getId_barang());
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print((k + 1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(b.getNama_barang());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(daftarKeranjang[k].getJumlah());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(b.getHarga());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(b.getHarga() * daftarKeranjang[k].getJumlah());
      out.write("</td>\n");
      out.write("                <td><a class=\"btn btn-danger\" href=\"../deleteBarangKeranjang?id=");
      out.print(daftarKeranjang[k].getId());
      out.write("\">Hapus</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <tr>\n");
      out.write("            <form action=\"../selesaiTransaksi\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"id_akun\" value=\"");
      out.print(login.getId());
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name=\"total_biaya\" value=\"");
      out.print(total);
      out.write("\">\n");
      out.write("                <td><input type=\"submit\" class=\"btn btn-primary\" value=\"Selesai\"></td>\n");
      out.write("            </form>\n");
      out.write("            </tr>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("        ");
 } 
      out.write('\n');
      out.write("<!-- Start Footer-->\r\n");
      out.write("            <div class=\"card text-center sticky-bottom\" style=\"bottom: 0;\">\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  Copyright &copy; 2019 by Kontrakan Penikmat Senja. No Rights Reserved\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"../template/js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
