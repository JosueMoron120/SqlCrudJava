package com.example.crudsqlite;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0017"},
        d2 = {"Lcom/example/crudsqlite/ProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/crudsqlite/ProductAdapter$ProductViewHolder;", "scheduleList", "Ljava/util/ArrayList;", "Lcom/example/crudsqlite/ProductModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getScheduleList", "()Ljava/util/ArrayList;", "setScheduleList", "deleteItem", "", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductViewHolder", "CrudSqlite.app"}
)
public final class ProductAdapter1 extends Adapter {
    @NotNull
    private ArrayList scheduleList;

    @NotNull
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View var10000 = LayoutInflater.from(parent.getContext()).inflate(1300069, parent, false);
        Intrinsics.checkNotNullExpressionValue(var10000, "LayoutInflater.from(pare…duct_item, parent, false)");
        View view = var10000;
        return new ProductAdapter.ProductViewHolder(view);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public void onBindViewHolder(@NotNull final ProductAdapter.ProductViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object var10000 = this.scheduleList.get(position);
        Intrinsics.checkNotNullExpressionValue(var10000, "scheduleList[position]");
        final ProductModel productElement = (ProductModel)var10000;
        holder.assignData(productElement);
        holder.getDeleteButton().setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Log.w("ContentValues", "INgeniero quevin");
                MaterialAlertDialogBuilder var10000 = new MaterialAlertDialogBuilder(holder.getDeleteButton().getContext());
                Context var10001 = holder.getDeleteButton().getContext();
                Intrinsics.checkNotNullExpressionValue(var10001, "holder.deleteButton.context");
                var10000 = var10000.setMessage((CharSequence)var10001.getResources().getString(1900080));
                var10001 = holder.getDeleteButton().getContext();
                Intrinsics.checkNotNullExpressionValue(var10001, "holder.deleteButton.context");
                var10000 = var10000.setNegativeButton((CharSequence)var10001.getResources().getString(1900013), (android.content.DialogInterface.OnClickListener)null.INSTANCE);
                var10001 = holder.getDeleteButton().getContext();
                Intrinsics.checkNotNullExpressionValue(var10001, "holder.deleteButton.context");
                var10000.setPositiveButton((CharSequence)var10001.getResources().getString(1900022), (android.content.DialogInterface.OnClickListener)(new android.content.DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialog, int which) {
                        (new SQLiteHelper(holder.getDeleteButton().getContext())).deleteProducto(productElement.getIdproducto());
                        ProductAdapter.this.deleteItem(position);
                        Toast.makeText(holder.getDeleteButton().getContext(), (CharSequence)"Successfully deleted element", 0).show();
                    }
                })).show();
            }
        }));
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(ViewHolder var1, int var2) {
        this.onBindViewHolder((ProductAdapter.ProductViewHolder)var1, var2);
    }

    public final void deleteItem(int position) {
        this.scheduleList.remove(position);
        this.notifyItemRemoved(position);
        this.notifyItemRangeChanged(position, this.getItemCount());
    }

    public int getItemCount() {
        return this.scheduleList.size();
    }

    @NotNull
    public final ArrayList getScheduleList() {
        return this.scheduleList;
    }

    public final void setScheduleList(@NotNull ArrayList var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.scheduleList = var1;
    }

    public ProductAdapter(@NotNull ArrayList scheduleList) {
        Intrinsics.checkNotNullParameter(scheduleList, "scheduleList");
        super();
        this.scheduleList = scheduleList;
    }

    @Metadata(
            mv = {1, 5, 1},
            k = 1,
            d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006$"},
            d2 = {"Lcom/example/crudsqlite/ProductAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "deleteButton", "Landroid/widget/Button;", "getDeleteButton", "()Landroid/widget/Button;", "setDeleteButton", "(Landroid/widget/Button;)V", "editButton", "getEditButton", "setEditButton", "name", "Landroid/widget/TextView;", "getName", "()Landroid/widget/TextView;", "setName", "(Landroid/widget/TextView;)V", "nomcat", "getNomcat", "setNomcat", "price", "getPrice", "setPrice", "stock", "getStock", "setStock", "assignData", "", "productModel", "Lcom/example/crudsqlite/ProductModel;", "onClick", "v", "CrudSqlite.app"}
    )
    public static final class ProductViewHolder extends ViewHolder implements OnClickListener {
        @NotNull
        private TextView name;
        @NotNull
        private TextView price;
        @NotNull
        private TextView stock;
        @NotNull
        private TextView nomcat;
        @NotNull
        private Button deleteButton;
        @NotNull
        private Button editButton;

        @NotNull
        public final TextView getName() {
            return this.name;
        }

        public final void setName(@NotNull TextView var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            this.name = var1;
        }

        @NotNull
        public final TextView getPrice() {
            return this.price;
        }

        public final void setPrice(@NotNull TextView var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            this.price = var1;
        }

        @NotNull
        public final TextView getStock() {
            return this.stock;
        }

        public final void setStock(@NotNull TextView var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            this.stock = var1;
        }

        @NotNull
        public final TextView getNomcat() {
            return this.nomcat;
        }

        public final void setNomcat(@NotNull TextView var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            this.nomcat = var1;
        }

        @NotNull
        public final Button getDeleteButton() {
            return this.deleteButton;
        }

        public final void setDeleteButton(@NotNull Button var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            this.deleteButton = var1;
        }

        @NotNull
        public final Button getEditButton() {
            return this.editButton;
        }

        public final void setEditButton(@NotNull Button var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            this.editButton = var1;
        }

        public final void assignData(@NotNull final ProductModel productModel) {
            Intrinsics.checkNotNullParameter(productModel, "productModel");
            this.name.setText((CharSequence)productModel.getNomprod());
            this.price.setText((CharSequence)String.valueOf(productModel.getPrecio()));
            this.stock.setText((CharSequence)String.valueOf(productModel.getStock()));
            this.nomcat.setText((CharSequence)productModel.getNomcat());
            this.editButton.setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    Intent intent = new Intent(ProductViewHolder.this.getEditButton().getContext(), CreateProductActivity.class);
                    boolean var4 = false;
                    boolean var5 = false;
                    int var7 = false;
                    intent.putExtra("idproducto", productModel.getIdproducto());
                    intent.putExtra("nomprod", productModel.getNomprod());
                    intent.putExtra("precio", productModel.getPrecio());
                    intent.putExtra("stock", productModel.getStock());
                    ProductViewHolder.this.getEditButton().getContext().startActivity(intent);
                }
            }));
        }

        public void onClick(@Nullable View v) {
            int position = this.getAdapterPosition();
        }

        public ProductViewHolder(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            super(view);
            View var10001 = view.findViewById(1000074);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.findViewById(R.id.tv_product_item_name)");
            this.name = (TextView)var10001;
            var10001 = view.findViewById(1000020);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.findViewById(R.id.tv_product_item_price)");
            this.price = (TextView)var10001;
            var10001 = view.findViewById(1000278);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.findViewById(R.id.tv_product_item_stock)");
            this.stock = (TextView)var10001;
            var10001 = view.findViewById(1000179);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.findViewById(R.id.t…oduct_item_category_name)");
            this.nomcat = (TextView)var10001;
            var10001 = view.findViewById(1000139);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.findViewById(R.id.btn_product_item_delete)");
            this.deleteButton = (Button)var10001;
            var10001 = view.findViewById(1000355);
            Intrinsics.checkNotNullExpressionValue(var10001, "view.findViewById(R.id.btn_product_item_edit)");
            this.editButton = (Button)var10001;
        }
    }
}