package app79;

public class NhanvVienFullTime extends NhanVien {
    protected int ngayLamThem;
    protected int chucVu;
    private String ten; 

    public void NhanVienFullTime(String ten){
        this.ten = ten;
    }

    public void NhanVienFullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int chucVu){
        this.chucVu = chucVu;
    }

    @Override
    public String loaiNhanVien(){
        if(chucVu == NhanVien.NHAN_VIEN_SEP){
            return "Nhan vien sep.";
        } else {
            return "Nhan vien linh.";
        }
    }

    public void tinhLuong(){
        long luong;
        if(chucVu == NhanVien.NHAN_VIEN_SEP){
            luong = NhanVien.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * NhanVien.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = NhanVien.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * NhanVien.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
