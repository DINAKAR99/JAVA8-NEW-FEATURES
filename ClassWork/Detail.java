import java.util.List;

public class Detail {

  public int detailId;
  public List<String> details;

  public Detail(int detailId, List<String> details) {
    this.detailId = detailId;
    this.details = details;
  }

  public int getDetailId() {
    return detailId;
  }

  public void setDetailId(int detailId) {
    this.detailId = detailId;
  }

  public List<String> getDetails() {
    return details;
  }

  public void setDetails(List<String> details) {
    this.details = details;
  }
}
