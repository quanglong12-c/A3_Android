# Lab A3 – Android XML Layout

INT4211 – Lập trình trên các thiết bị di động.

## Nội dung
- Giao diện đăng nhập bằng XML.
- LinearLayout + FrameLayout + ScrollView.
- ConstraintLayout bản riêng: `activity_constraint.xml`.
- `layout-land/activity_main.xml` cho màn hình ngang.
- Tách `strings.xml`, `colors.xml`, `dimens.xml`, drawable XML.
- TextInputLayout với password toggle.
- Nút ĐĂNG NHẬP hiển thị Snackbar.
- Thẻ hồ sơ dùng `<include>`.

## Trước khi nộp
1. Mở `app/src/main/res/values/strings.xml`.
2. Đổi `YOUR_MSSV` thành MSSV thật.
3. Đổi `HỌ TÊN` thành họ tên thật.
4. Chụp wireframe vẽ tay.
5. Chạy màn hình dọc và ngang, chụp ảnh.
6. Có thể đổi Activity sang `R.layout.activity_constraint` để kiểm tra bản ConstraintLayout.
7. Commit và push repository lên GitHub theo tên `A3_<MSSV>`.

## Cấu trúc chính
- `MainActivity.java`
- `res/layout/activity_main.xml` – bản LinearLayout
- `res/layout/activity_constraint.xml` – bản ConstraintLayout
- `res/layout-land/activity_main.xml` – bản ngang
- `res/layout/profile_card.xml` – thẻ hồ sơ dùng include
- `res/drawable/` – background XML
- `res/values/` – strings/colors/dimens/theme
