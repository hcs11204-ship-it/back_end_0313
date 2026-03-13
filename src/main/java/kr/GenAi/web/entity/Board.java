package kr.GenAi.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long b_idx;
	
	private String b_title;
	
	private String b_content;
	
	@Column(updatable = false)
	private String b_writer;
	
	private String b_file_path;
	
	@JsonFormat(pattern = "yyyy-mm-dd", timezone = "Asia/Seoul")
	@Column(insertable = false, updatable = false, columnDefinition = "datetime default now()")
	private String b_create_at;

}
