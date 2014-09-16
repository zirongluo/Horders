package com.horders.utility;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;

public class DrawImageCode extends BufferedImage {

	private Color getRandColor(int s, int e) {
		Random random = new Random();
		if (s > 255)
			s = 255;
		if (e > 255)
			e = 255;
		int r = random.nextInt(e - s) + s; // �������RGB�е�Rֵ
		int g = random.nextInt(e - s) + s; // �������RGB�е�Gֵ
		int b = random.nextInt(e - s) + s; // �������RGB�е�Bֵ
		return new Color(r, g, b);
	}

	public DrawImageCode(int width, int height, int imageType) {
		super(width, height, imageType);
		// TODO Auto-generated constructor stub
	}

	public String getImageCode() {
		int width = this.getWidth();
		int heigh = this.getHeight();
		Graphics g = getGraphics();
		Random r = new Random();
		Font f = new Font("����", Font.PLAIN, 60); // ����������ʽ
		g.setColor(getRandColor(200, 250)); // ���ñ�����ɫ
		g.fillRect(0, 0, width, heigh); // ���Ʊ���
		g.setFont(f); // ��������
		g.setColor(getRandColor(180, 200)); // ����ǰ����ɫ

		Graphics2D g2d = (Graphics2D) g;
		// ��һ������
		// BasicStroke bs=new
		// BasicStroke(5f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
		// //����һ��������ѡ��������ϸ�Ķ���
		// g2d.setStroke(bs); //�ı������Ĵ�ϸ
		g2d.setColor(Color.DARK_GRAY); // ���õ�ǰ��ɫΪԤ������ɫ�е����ɫ
		int[] xPoints = new int[8];
		int[] yPoints = new int[8];
		for (int j = 0; j < 8; j++) {
			xPoints[j] = r.nextInt(width - 1);
			yPoints[j] = r.nextInt(heigh - 1);
		}
		g2d.drawPolyline(xPoints, yPoints, 8);

		String sRand = "";
		String ctmp = "";
		int itmp = 0;
		for (int i = 0; i < 6; i++) {
			switch (r.nextInt(2)) {
			case 1:
				itmp = r.nextInt(26) + 65; // ����A~Z����ĸ
				ctmp = String.valueOf((char) itmp);
				break;
			default:
				itmp = r.nextInt(10) + 48; // ����0~9������
				ctmp = String.valueOf((char) itmp);
				break;
			}
			sRand += ctmp;
			// ����ÿ���ַ��������ɫ
			Color color = new Color(20 + r.nextInt(210), 20 + r.nextInt(210),
					20 + r.nextInt(210));
			g2d.setColor(color);
			// ����ÿ���ַ����������
			g2d.setFont(this.getRandomFont());
			// ����ÿ���ַ��������ת
			AffineTransform at = new AffineTransform();
			int number = r.nextInt(3) - 1;
			double role = number * r.nextDouble() * (Math.PI / 4);
			at.setToRotation(role, 25 * i + 5, 55 - r.nextInt(20)); // role:��ת�Ƕ�,������������������Χ���������ת
			g2d.setTransform(at);

			g2d.drawString(ctmp, 25 * i + 5, 55 - r.nextInt(20));
		}
		return sRand.toString();
	}

	public static Font getRandomFont() {
		// String[] fonts = {"Georgia", "Verdana", "Arial", "Tahoma",
		// "Time News Roman", "Courier New", "Arial Black", "Quantzite"};
		String[] fonts = { "a_TrianglerCmUp", "Astarisborn", "WishfulWaves" };
		Random r = new Random();
		int fontIndex = r.nextInt(fonts.length);
		return new Font(fonts[fontIndex], r.nextInt(3), 50 - r.nextInt(20));
	}

}
